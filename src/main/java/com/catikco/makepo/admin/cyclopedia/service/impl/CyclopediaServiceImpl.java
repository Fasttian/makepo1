package com.catikco.makepo.admin.cyclopedia.service.impl;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.cyclopedia.model.CyclopediaEditPageModel;
import com.catikco.makepo.admin.cyclopedia.model.CyclopediaListPageModel;
import com.catikco.makepo.admin.cyclopedia.model.CyclopediaRequestPageModel;
import com.catikco.makepo.admin.cyclopedia.service.CyclopediaService;
import com.catikco.makepo.entity.CyclopediaExample;
import com.catikco.makepo.entity.CyclopediaWithBLOBs;
import com.catikco.makepo.mapper.CyclopediaMapper;
import com.catikco.makepo.oss.service.FileStorageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.catikco.makepo.common.DateUtils.dateToString;
import static com.catikco.makepo.common.StringUtils.parseContentFileId;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 16:09
 * Description：
 */
@Service(value = "admin.cyclopediaService")
public class CyclopediaServiceImpl implements CyclopediaService {

    @Autowired
    private CyclopediaMapper cyclopediaMapper;

    @Autowired
    private FileStorageService fileStorageService;

    /**
     * 加载新闻列表
     * @param cyclopediaRequestPageModel
     * @return
     */
    @Override
    public DatatablesResponsePageModel<CyclopediaListPageModel> getCyclopediaList(CyclopediaRequestPageModel cyclopediaRequestPageModel) {

        DatatablesResponsePageModel datatablesResponsePageModel = new DatatablesResponsePageModel();     //要返回给页面的新闻列表model

        CyclopediaExample cyclopediaExample = new CyclopediaExample();                    //example用于添加条件，相当where后面的部分
        CyclopediaExample.Criteria criteria =cyclopediaExample.createCriteria();    //创建封装条件的对象

        Integer length = cyclopediaRequestPageModel.getLength();      //请求条数
        Integer start=cyclopediaRequestPageModel.getStart();          //起始记录
        Integer currentPage = start/length+1;                   //当前页
        String sortName = cyclopediaRequestPageModel.getOrderColumn();   //排序字段名
        String sort = cyclopediaRequestPageModel.getOrderDir();           //排序方式 asc/desc

        String title = cyclopediaRequestPageModel.getTitle();         //按新闻标题查询

        // 设置排序方式
        if (sortName != null && !sortName.isEmpty()) {
            cyclopediaExample.setOrderByClause(sortName + " " + sort);
        }

        // 按新闻标题查询
        if (!"".equals(title)) {
            title = "%" + title + "%";
            criteria.andTitleLike(title);
        }

        //查询标记为未删除的
        criteria.andDeletedEqualTo(false);

        //设置分页信息
        PageHelper.startPage(currentPage,length);

        //根据条件从数据库查询出新闻
        List<CyclopediaWithBLOBs> cyclopediaList = cyclopediaMapper.selectByExampleWithBLOBs(cyclopediaExample);

        //让pageInfo对象进行分页的处理
        PageInfo<CyclopediaWithBLOBs> pageInfo = new PageInfo<>(cyclopediaList);

        datatablesResponsePageModel.setRecordsFiltered((int)pageInfo.getTotal());
        datatablesResponsePageModel.setRecordsTotal((int)pageInfo.getTotal());
        datatablesResponsePageModel.setDraw(cyclopediaRequestPageModel.getDraw());

        datatablesResponsePageModel.setData(this.changeToCyclopediaListPageModel(cyclopediaList));

        return datatablesResponsePageModel;
    }

    /**
     *
     * @param cyclopediaEditPageModel 编辑框页面model
     * @param response  响应页面请求
     */
    //@Transactional
    public int saveCyclopedia(CyclopediaEditPageModel cyclopediaEditPageModel, HttpServletResponse response){

        //修改时允许不选择概要图片
        String cyclopediaTitleImage = null; //概要图片文件id
        String cyclopediaContentFileid = null;     //内容图片文件id
        MultipartFile multipartFile = cyclopediaEditPageModel.getTitImage();
        if(null != cyclopediaEditPageModel.getTitImage().getOriginalFilename())
            cyclopediaTitleImage = fileStorageService.uploads(cyclopediaEditPageModel.getTitImage(), response,true,null);

        cyclopediaContentFileid = parseContentFileId(cyclopediaEditPageModel.getContent());

        CyclopediaWithBLOBs cyclopediaWithBLOBs = this.changeToCyclopediaWithBLOBs(cyclopediaEditPageModel, cyclopediaTitleImage, cyclopediaContentFileid);
        //插数据库
        if(null != cyclopediaEditPageModel.getId() && !"".equals(cyclopediaEditPageModel.getId())){
            cyclopediaWithBLOBs.setUpdateTime(new Date());
            return cyclopediaMapper.updateByPrimaryKeySelective(cyclopediaWithBLOBs);
        }else {
            cyclopediaWithBLOBs.setCreateTime(new Date());
            return cyclopediaMapper.insert(cyclopediaWithBLOBs);
        }

    }

    /**
     * 加载新闻到编辑框
     * @param id
     * @return
     */
    @Override
    public CyclopediaEditPageModel loadCyclopedia(Integer id) {
        CyclopediaWithBLOBs cyclopediaWithBLOBs = cyclopediaMapper.selectByPrimaryKey(id);
        if(cyclopediaWithBLOBs!= null){
           return changeToCyclopediaEditPageModel(cyclopediaWithBLOBs);
        }
        return null;
    }

    @Override
    public Integer deleteCyclopedia(Integer id) {
        CyclopediaWithBLOBs cyclopediaWithBLOBs =null;
        if(null != id ){
            cyclopediaWithBLOBs =  cyclopediaMapper.selectByPrimaryKey(id);
            cyclopediaWithBLOBs.setDeleted(true);
            return cyclopediaMapper.updateByPrimaryKey(cyclopediaWithBLOBs);
        }
        return null;
    }

    /******************************** 私有方法：转换新闻为页面视图model ************************************/

    private CyclopediaEditPageModel changeToCyclopediaEditPageModel(CyclopediaWithBLOBs CyclopediaWithBLOBs){
        CyclopediaEditPageModel cyclopediaEditPageModel = new CyclopediaEditPageModel();
        cyclopediaEditPageModel.setId(CyclopediaWithBLOBs.getId());
        cyclopediaEditPageModel.setDigest(CyclopediaWithBLOBs.getDigest());
        cyclopediaEditPageModel.setKeywords(CyclopediaWithBLOBs.getKeywords());
        cyclopediaEditPageModel.setTitle(CyclopediaWithBLOBs.getTitle());
        cyclopediaEditPageModel.setContent(CyclopediaWithBLOBs.getContent());
        cyclopediaEditPageModel.setDescription(CyclopediaWithBLOBs.getDescription());
        cyclopediaEditPageModel.setCyclopediaCreateTime(CyclopediaWithBLOBs.getCyclopediaCreateTime());
        cyclopediaEditPageModel.setCyclopediaResources(CyclopediaWithBLOBs.getCyclopediaResources());
        cyclopediaEditPageModel.setCyclopediaType(CyclopediaWithBLOBs.getCyclopediaType());

        return cyclopediaEditPageModel;
    }


    /**
     * 转换数据model为页面model
     * @param cyclopediaList
     * @return
     */
    private List<CyclopediaListPageModel> changeToCyclopediaListPageModel(List<CyclopediaWithBLOBs> cyclopediaList){

        List<CyclopediaListPageModel> cyclopediaListPageModelList = new ArrayList<>();

        for(CyclopediaWithBLOBs cyclopedia:cyclopediaList){
            CyclopediaListPageModel cyclopediaListPageModel = new CyclopediaListPageModel();
            cyclopediaListPageModel.setId(cyclopedia.getId());
            cyclopediaListPageModel.setTitle(cyclopedia.getTitle());
            cyclopediaListPageModel.setCyclopediaCreateTime(dateToString(cyclopedia.getCyclopediaCreateTime()));
            cyclopediaListPageModel.setCyclopediaType(cyclopedia.getCyclopediaType());
            cyclopediaListPageModel.setCyclopediaResources(cyclopedia.getCyclopediaResources());
            cyclopediaListPageModel.setKeywords(cyclopedia.getKeywords());
            cyclopediaListPageModelList.add(cyclopediaListPageModel);
        }

        return cyclopediaListPageModelList;
    }

    /**
     * 转换页面model为数据model
     * @param cyclopediaEditPageModel  页面model
     * @param cyclopediaTitleImage 新闻概要图片文件id（一个）
     * @param cyclopediaContentImagesFileid 新内容正中的图片id(多个)
     * @return
     */
    private CyclopediaWithBLOBs changeToCyclopediaWithBLOBs(CyclopediaEditPageModel cyclopediaEditPageModel, String cyclopediaTitleImage, String cyclopediaContentImagesFileid){
        CyclopediaWithBLOBs cyclopediaWithBLOBs = new CyclopediaWithBLOBs();

        cyclopediaWithBLOBs.setTitle(cyclopediaEditPageModel.getTitle());
        cyclopediaWithBLOBs.setDigest(cyclopediaEditPageModel.getDigest());
        cyclopediaWithBLOBs.setContent(cyclopediaEditPageModel.getContent());
        cyclopediaWithBLOBs.setDescription(cyclopediaEditPageModel.getDescription());
        cyclopediaWithBLOBs.setKeywords(cyclopediaEditPageModel.getKeywords());
        cyclopediaWithBLOBs.setCyclopediaType(cyclopediaEditPageModel.getCyclopediaType());         //新闻类型
        cyclopediaWithBLOBs.setCyclopediaContentImagesFileid(cyclopediaContentImagesFileid);  //新闻内容中的图片id
        cyclopediaWithBLOBs.setCyclopediaTitleImage(cyclopediaTitleImage);        //新闻概要图中的id
        cyclopediaWithBLOBs.setViews(null);                                       //浏览次数暂时不作处理
        cyclopediaWithBLOBs.setDeleted(false);                                    //新闻删除状态默认标记为未删除
        cyclopediaWithBLOBs.setCyclopediaUrl("/cyclopedia-detail");                           //新闻链接默认为cyclopedia-detail
        cyclopediaWithBLOBs.setCyclopediaResources(cyclopediaEditPageModel.getCyclopediaResources());
        cyclopediaWithBLOBs.setCyclopediaCreateTime(cyclopediaEditPageModel.getCyclopediaCreateTime());  //新闻发布时间
        cyclopediaWithBLOBs.setId(cyclopediaEditPageModel.getId());

        return cyclopediaWithBLOBs;

    }


}
