package com.catikco.makepo.admin.news.service.impl;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.news.model.NewsEditPageModel;
import com.catikco.makepo.admin.news.model.NewsListPageModel;
import com.catikco.makepo.admin.news.model.NewsRequestPageModel;
import com.catikco.makepo.admin.news.service.NewsService;
import com.catikco.makepo.entity.*;
import com.catikco.makepo.mapper.FileStorageMapper;
import com.catikco.makepo.mapper.NewsMapper;
import com.catikco.makepo.oss.service.FileStorageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.catikco.makepo.common.StringUtils.cutContentFileId;
import static com.catikco.makepo.common.StringUtils.mergeContentFileId;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/1/2018  14:18
 * Description：
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private FileStorageService fileStorageService;

    @Autowired
    private FileStorageMapper filestorageMapper;

    /**
     * 加载新闻列表
     * @param newsRequestPageModel
     * @return
     */
    @Override
    public DatatablesResponsePageModel<NewsListPageModel> getNewsList(NewsRequestPageModel newsRequestPageModel) {

        DatatablesResponsePageModel datatablesResponsePageModel = new DatatablesResponsePageModel();     //要返回给页面的新闻列表model

        NewsExample newsExample = new NewsExample();                    //example用于添加条件，相当where后面的部分
        NewsExample.Criteria criteria =newsExample.createCriteria();    //创建封装条件的对象

        Integer length = newsRequestPageModel.getLength();      //请求条数
        Integer start=newsRequestPageModel.getStart();          //起始记录
        Integer currentPage = start/length+1;                   //当前页
        String sortName = newsRequestPageModel.getOrderColumn();   //排序字段名
        String sort = newsRequestPageModel.getOrderDir();           //排序方式 asc/desc

        String title = newsRequestPageModel.getTitle();         //按新闻标题查询

        // 设置排序方式
        if (sortName != null && !sortName.isEmpty()) {
            newsExample.setOrderByClause(sortName + " " + sort);
        }

        // 按新闻标题查询
        if (!"".equals(title)) {
            title = "%" + title + "%";
            criteria.andTitleLike(title);
        }

        //设置分页信息
        PageHelper.startPage(currentPage,length);

        //根据条件从数据库查询出新闻
        List<News> newsList = newsMapper.selectByExample(newsExample);

        //让pageInfo对象进行分页的处理
        PageInfo<News> pageInfo = new PageInfo<>(newsList);

        datatablesResponsePageModel.setRecordsFiltered((int)pageInfo.getTotal());
        datatablesResponsePageModel.setRecordsTotal((int)pageInfo.getTotal());
        datatablesResponsePageModel.setDraw(newsRequestPageModel.getDraw());

        datatablesResponsePageModel.setData(this.changeToNewsListPageModel(newsList));

        return datatablesResponsePageModel;
    }

    /**
     *
     * @param newsEditPageModel 编辑框页面model
     * @param response  响应页面请求
     */
    public void saveNews(NewsEditPageModel newsEditPageModel, HttpServletResponse response){
        //Integer newsTitleImageFileid = fileStorageService.uploads(newsEditPageModel.getMultipartFile(), response);      //概要图片文件id
        Integer newsTitleImageFileid = 24;

        String newsContentImagesFileid = mergeContentFileId(newsEditPageModel.getContent());      //处理内容中的文件id(多个)

        NewsWithBLOBs newsWithBLOBs = this.changeToNewsWithBLOBs(newsEditPageModel, newsTitleImageFileid, newsContentImagesFileid);

        //把文件状态改为正常
        List<Integer> fileIdList = cutContentFileId(newsContentImagesFileid);
        for(Integer fid:fileIdList){
            FileStorageExample filestorageExample = new FileStorageExample();
            FileStorageExample.Criteria criteria = filestorageExample.createCriteria();
            criteria.andIdEqualTo(fid);

            FileStorage filestorage = new FileStorage();
            List<FileStorage> filestorageList = filestorageMapper.selectByExample(filestorageExample);
            if (!filestorageList.isEmpty())
            filestorage=filestorageList.get(0);

            filestorage.setFileStatus((byte)2);     //设置文件状态正常
            filestorage.setRemark("不正常文件");
            filestorageMapper.updateByPrimaryKey(filestorage);
        }

        //插数据库
        newsMapper.insert(newsWithBLOBs);

    }


    /******************************** 私有方法：转换新闻为页面视图model ************************************/

    /**
     * 转换数据model为页面model
     * @param newsList
     * @return
     */
    private List<NewsListPageModel> changeToNewsListPageModel(List<News> newsList){

        List<NewsListPageModel> newsListPageModelList = new ArrayList<>();

        for(News news:newsList){
            NewsListPageModel newsListPageModel = new NewsListPageModel();

            newsListPageModel.setTitle(news.getTitle());
            newsListPageModel.setKeywords(news.getKeywords());

            newsListPageModelList.add(newsListPageModel);

        }

        return newsListPageModelList;
    }

    /**
     * 转换页面model为数据model
     * @param newsEditPageModel  页面model
     * @param newsTitleImageFileid 新闻概要图片文件id（一个）
     * @param newsContentImagesFileid 新内容正中的图片id(多个)
     * @return
     */
    private NewsWithBLOBs changeToNewsWithBLOBs(NewsEditPageModel newsEditPageModel, Integer newsTitleImageFileid, String newsContentImagesFileid){
        NewsWithBLOBs newsWithBLOBs = new NewsWithBLOBs();

        newsWithBLOBs.setTitle(newsEditPageModel.getTitle());
        newsWithBLOBs.setDigest(newsEditPageModel.getDigest());
        newsWithBLOBs.setContent(newsEditPageModel.getContent());
        newsWithBLOBs.setDecription(newsEditPageModel.getDecription());
        newsWithBLOBs.setKeywords(newsEditPageModel.getKeywords());
        newsWithBLOBs.setNewsType(newsEditPageModel.getNewsType());         //新闻类型
        newsWithBLOBs.setNewsContentImagesFileid(newsContentImagesFileid);  //新闻内容中的图片id
        newsWithBLOBs.setNewsTitleImageFileid(newsTitleImageFileid);        //新闻概要图中的id
        newsWithBLOBs.setViews(null);                                       //浏览次数暂时不作处理
        newsWithBLOBs.setDeleted(false);                                    //新闻删除状态默认标记为未删除
        newsWithBLOBs.setNewsUrl("/news-detail");                           //新闻链接默认为news-detail
        newsWithBLOBs.setNewsResources(newsEditPageModel.getNewsresources());
        newsWithBLOBs.setCreateTime(new Date());                            //新闻创建时间为用户指定时间


        return newsWithBLOBs;

    }


}
