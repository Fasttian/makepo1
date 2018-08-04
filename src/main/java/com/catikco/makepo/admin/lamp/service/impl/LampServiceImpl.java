package com.catikco.makepo.admin.lamp.service.impl;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.lamp.model.LampEditPageModel;
import com.catikco.makepo.admin.lamp.model.LampListPageModel;
import com.catikco.makepo.admin.lamp.model.LampRequestPageModel;
import com.catikco.makepo.admin.lamp.service.LampService;
import com.catikco.makepo.entity.Lamp;
import com.catikco.makepo.entity.LampExample;
import com.catikco.makepo.entity.LampWithBLOBs;
import com.catikco.makepo.mapper.LampMapper;
import com.catikco.makepo.oss.service.FileStorageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

import static com.catikco.makepo.common.StringUtils.parseContentFileId;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:23
 * Description：
 */
@Service
public class LampServiceImpl implements LampService {
    @Autowired
    private LampMapper lampMapper;

    @Autowired
    private FileStorageService fileStorageService;

    /**
     * 加载产品列表
     * @param lampRequestPageModel
     * @return
     */
    @Override
    public DatatablesResponsePageModel<LampListPageModel> getLampList(LampRequestPageModel lampRequestPageModel) {
        DatatablesResponsePageModel datatablesResponsePageModel = new DatatablesResponsePageModel();     //要返回给页面的新闻列表model

        LampExample lampExample = new LampExample();                    //example用于添加条件，相当where后面的部分
        LampExample.Criteria criteria =lampExample.createCriteria();    //创建封装条件的对象

        Integer length = lampRequestPageModel.getLength();      //请求条数
        Integer start=lampRequestPageModel.getStart();          //起始记录
        Integer currentPage = start/length+1;                   //当前页
        String sortName = lampRequestPageModel.getOrderColumn();   //排序字段名
        String sort = lampRequestPageModel.getOrderDir();           //排序方式 asc/desc

        String model = lampRequestPageModel.getModel();         //按新闻标题查询

        // 设置排序方式
//        if (sortName != null && !sortName.isEmpty()) {
//            lampExample.setOrderByClause(sortName + " " + sort);
//        }

        // 按新闻标题查询
        if (!"".equals(model)) {
            model = "%" + model + "%";
            criteria.andModelLike(model);
        }

        //设置分页信息
        PageHelper.startPage(currentPage,length);

        //根据条件从数据库查询出新闻
        List<LampWithBLOBs> lampList = lampMapper.selectByExampleWithBLOBs(lampExample);

        //让pageInfo对象进行分页的处理
        PageInfo<LampWithBLOBs> pageInfo = new PageInfo<>(lampList);

        datatablesResponsePageModel.setRecordsFiltered((int)pageInfo.getTotal());
        datatablesResponsePageModel.setRecordsTotal((int)pageInfo.getTotal());
        datatablesResponsePageModel.setDraw(lampRequestPageModel.getDraw());

        datatablesResponsePageModel.setData(this.changeToLampListPageModel(lampList));

        return datatablesResponsePageModel;

    }


    @Override
    public int saveLamp(LampEditPageModel lampEditPageModel, HttpServletResponse response) {
        //修改时允许不选择概要图片
        Integer lampTitleImageFileid = null; //概要图片文件id
        String lampContentFileid = null;     //内容图片文件id
        MultipartFile multipartFile = lampEditPageModel.getTitImage();
        if (null != lampEditPageModel.getTitImage().getOriginalFilename())
            lampTitleImageFileid = fileStorageService.uploads(lampEditPageModel.getTitImage(), response, true);

//        lampContentFileid = parseContentFileId(lampEditPageModel.getContent());

        LampWithBLOBs lampWithBLOBs = this.changeToLamp(lampEditPageModel, lampTitleImageFileid, null);
        //插数据库
        if (null != lampEditPageModel.getId() && !"".equals(lampEditPageModel.getId())) {
            int iss = lampMapper.updateByPrimaryKeySelective(lampWithBLOBs);
            return iss;
        } else {
            return lampMapper.insert(lampWithBLOBs);

        }
    }

    @Override
    public LampEditPageModel loadLamp(Integer id) {
        Lamp lamp = lampMapper.selectByPrimaryKey(id);
        if (lamp != null) {
            return changeToLampEditPageModel(lamp);
        }
        return null;
    }

    /*************************** 私有方法： 转换灯具为页面视图 model ***********************************/

    private LampEditPageModel changeToLampEditPageModel(Lamp lamp){
        LampEditPageModel lampEditPageModel = new LampEditPageModel();
        lampEditPageModel.setId(lamp.getId());
        lampEditPageModel.setModel(lamp.getModel());
        lampEditPageModel.setPower(lamp.getPower());
        lampEditPageModel.setVoltage(lamp.getVoltage());
        lampEditPageModel.setSize(lamp.getSize());
        lampEditPageModel.setLumen(lamp.getLumen());
        lampEditPageModel.setMaterial(lamp.getMaterial());

        return lampEditPageModel;
    }

    /**
     * 转换数据model为页面model
     * @param lampList
     * @return
     */
    private List<LampListPageModel> changeToLampListPageModel(List<LampWithBLOBs> lampList){

        List<LampListPageModel> lampListPageModelList = new ArrayList<>();

        for(LampWithBLOBs lamp:lampList){
            LampListPageModel lampListPageModel = new LampListPageModel();
            lampListPageModel.setId(lamp.getId());
            lampListPageModel.setModel(lamp.getModel());
            lampListPageModel.setSize(lamp.getSize());
            lampListPageModel.setPower(lamp.getPower());
            lampListPageModel.setTitle(lamp.getTitle());
            lampListPageModel.setProductType(lamp.getProductType());
            lampListPageModelList.add(lampListPageModel);
        }
        return lampListPageModelList;
    }

    /**
     * 转换页面 model 为数据 model
     * @param lampEditPageModel 页面 model
     * @param productTitleImageFileid 产品概要图片文件 id（一个）
     * @param productContentImageFileid 产品详情页中可能有多张图片id（预览参数）
     */
    private LampWithBLOBs changeToLamp(LampEditPageModel lampEditPageModel, Integer productTitleImageFileid, String productContentImageFileid){
        LampWithBLOBs lampWithBLOBs = new LampWithBLOBs();

        lampWithBLOBs.setId(lampEditPageModel.getId());
        lampWithBLOBs.setProductTitleImageFileid(productTitleImageFileid);
        lampWithBLOBs.setModel(lampEditPageModel.getModel());

        return lampWithBLOBs;
    }

}
