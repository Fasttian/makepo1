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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import static com.catikco.makepo.common.StringUtils.cutContentFileId;
import static com.catikco.makepo.common.StringUtils.parseContentFileId;

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
        List<NewsWithBLOBs> newsList = newsMapper.selectByExampleWithBLOBs(newsExample);

        //让pageInfo对象进行分页的处理
        PageInfo<NewsWithBLOBs> pageInfo = new PageInfo<>(newsList);

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
    //@Transactional
    public int saveNews(NewsEditPageModel newsEditPageModel, HttpServletResponse response){

        //修改时允许不选择概要图片
        Integer newTitleImageFileid = null; //概要图片文件id
        String newContentFileid = null;     //内容图片文件id
        MultipartFile multipartFile = newsEditPageModel.getTitImage();
        if(null != newsEditPageModel.getTitImage().getOriginalFilename())
            newTitleImageFileid = fileStorageService.uploads(newsEditPageModel.getTitImage(), response,true);

        newContentFileid = parseContentFileId(newsEditPageModel.getContent());

        NewsWithBLOBs newsWithBLOBs = this.changeToNewsWithBLOBs(newsEditPageModel, newTitleImageFileid, newContentFileid);
        //插数据库
        if(null != newsEditPageModel.getId() && !"".equals(newsEditPageModel.getId())){
            int iss = newsMapper.updateByPrimaryKeySelective(newsWithBLOBs);
            return iss;
        }else {
            return newsMapper.insert(newsWithBLOBs);
        }

        /**************************************** 处理文件状态start *********************************************/
      /*  String newFid = null;     //新文件id
        if(! "".equals(newTitleImageFileid)){
            if(!"".equals(newContentFileid)){
                newFid = newTitleImageFileid + "," + newContentFileid;
            }else {
                newFid = newTitleImageFileid + "";
            }
        }else {
            if(!"".equals(newContentFileid))
                newFid = newContentFileid;
        }
        //转换fid为List<Integer>
        List<Integer> newFidList = cutContentFileId(newFid);
        //设置新文件状态

        String oldFid = null;           //旧文件id
        Integer oldTitleFid = null;      //旧概要图文件id
        String oldContentFid = null;     //旧内容图文件id
        News oldNews = null;
        if( ! "".equals(newsEditPageModel.getId())){
            oldNews = newsMapper.selectByPrimaryKey(newsEditPageModel.getId());
            oldTitleFid = oldNews.getNewsTitleImageFileid();
            oldContentFid = oldNews.getNewsContentImagesFileid();
        }

        if(null != oldNews){
           if(!"".equals(oldTitleFid)){
               if(!"".equals(oldContentFid)){
                    oldFid = oldTitleFid +","+oldContentFid;
               }else {
                   oldFid = oldTitleFid + "";
               }
           }else {
               if(!"".equals(oldContentFid))
                   oldFid = oldContentFid;
           }
        }
        //转换fid为List<Integer>
        List<Integer> oldFidList = cutContentFileId(oldFid);

        //处理文件状态
        if(null != newsEditPageModel.getId() && !"".equals(newsEditPageModel.getId())){
            if (newFidList.containsAll(oldFidList) && oldFidList.containsAll(newFidList)) {
                return;
            }
            Iterator<Integer> newiterator = newFidList.iterator();
            while (newiterator.hasNext()) {
                Integer newId = newiterator.next();
                Iterator<Integer> oldIterator = oldFidList.iterator();
                while (oldIterator.hasNext()) {
                    Integer oldId = oldIterator.next();
                    if (newId == oldId || newId.equals(oldId)) {
                        newiterator.remove();
                        oldIterator.remove();
                    }
                }
            }
            //设置旧文件状态
        }*/
        /**************************************** 处理文件状态end *********************************************/

    }

    /**
     * 加载新闻到编辑框
     * @param id
     * @return
     */
    @Override
    public NewsEditPageModel loadNews(Integer id) {
        NewsWithBLOBs newsWithBLOBs = newsMapper.selectByPrimaryKey(id);
        if(newsWithBLOBs!= null){
           return changeToNewsEditPageModel(newsWithBLOBs);
        }
        return null;
    }

    /******************************** 私有方法：转换新闻为页面视图model ************************************/

    private NewsEditPageModel changeToNewsEditPageModel(NewsWithBLOBs newsWithBLOBs){
        NewsEditPageModel newsEditPageModel = new NewsEditPageModel();
        newsEditPageModel.setId(newsWithBLOBs.getId());
        newsEditPageModel.setDigest(newsWithBLOBs.getDigest());
        newsEditPageModel.setKeywords(newsWithBLOBs.getKeywords());
        newsEditPageModel.setTitle(newsWithBLOBs.getTitle());
        newsEditPageModel.setContent(newsWithBLOBs.getContent());
        newsEditPageModel.setDescription(newsWithBLOBs.getDecription());
        newsEditPageModel.setNewsCreateTime(newsWithBLOBs.getNewsCreateTime());
        newsEditPageModel.setNewsResources(newsWithBLOBs.getNewsResources());
        newsEditPageModel.setNewsType(newsWithBLOBs.getNewsType());

        return newsEditPageModel;
    }


    /**
     * 转换数据model为页面model
     * @param newsList
     * @return
     */
    private List<NewsListPageModel> changeToNewsListPageModel(List<NewsWithBLOBs> newsList){

        List<NewsListPageModel> newsListPageModelList = new ArrayList<>();

        for(NewsWithBLOBs news:newsList){
            NewsListPageModel newsListPageModel = new NewsListPageModel();
            newsListPageModel.setId(news.getId());
            newsListPageModel.setTitle(news.getTitle());
            newsListPageModel.setDigest(news.getDigest());
            newsListPageModel.setNewsCreateTime(news.getNewsCreateTime());
            newsListPageModel.setNewsType(news.getNewsType());
            newsListPageModel.setNewsResources(news.getNewsResources());
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
        newsWithBLOBs.setDecription(newsEditPageModel.getDescription());
        newsWithBLOBs.setKeywords(newsEditPageModel.getKeywords());
        newsWithBLOBs.setNewsType(newsEditPageModel.getNewsType());         //新闻类型
        newsWithBLOBs.setNewsContentImagesFileid(newsContentImagesFileid);  //新闻内容中的图片id
        newsWithBLOBs.setNewsTitleImageFileid(newsTitleImageFileid);        //新闻概要图中的id
        newsWithBLOBs.setViews(null);                                       //浏览次数暂时不作处理
        newsWithBLOBs.setDeleted(false);                                    //新闻删除状态默认标记为未删除
        newsWithBLOBs.setNewsUrl("/news-detail");                           //新闻链接默认为news-detail
        newsWithBLOBs.setNewsResources(newsEditPageModel.getNewsResources());
        newsWithBLOBs.setCreateTime(new Date());                            //新闻创建时间为用户指定时间
        newsWithBLOBs.setNewsCreateTime(newsEditPageModel.getNewsCreateTime());  //新闻发布时间
        newsWithBLOBs.setId(newsEditPageModel.getId());



        return newsWithBLOBs;

    }


}
