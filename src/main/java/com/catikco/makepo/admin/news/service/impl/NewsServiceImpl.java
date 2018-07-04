package com.catikco.makepo.admin.news.service.impl;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.news.model.NewsListPageModel;
import com.catikco.makepo.admin.news.model.NewsRequestPageModel;
import com.catikco.makepo.admin.news.service.NewsService;
import com.catikco.makepo.entity.News;
import com.catikco.makepo.entity.NewsExample;
import com.catikco.makepo.mapper.NewsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/1/2018  14:18
 * Description：
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public DatatablesResponsePageModel<NewsListPageModel> getNewsList(NewsRequestPageModel newsRequestPageModel) {

        DatatablesResponsePageModel datatablesResponsePageModel = new DatatablesResponsePageModel();     //要返回给页面的新闻列表model

        NewsExample newsExample = new NewsExample();                    //example用于添加条件，相当where后面的部分
        NewsExample.Criteria criteria =newsExample.createCriteria();    //创建封装条件的对象

        Integer length = newsRequestPageModel.getLength();      //请求条数
        Integer start=newsRequestPageModel.getStart();          //起始记录
        Integer currentPage = start/length+1;                   //当前页

        //设置分页信息
        PageHelper.startPage(currentPage,length);

        //根据条件从数据库查询出新闻
        List<News> newsList = newsMapper.selectByExample(newsExample);

        //让pageInfo对象进行分页的处理
        PageInfo<News> pageInfo = new PageInfo<>(newsList);

        datatablesResponsePageModel.setRecordsFiltered(pageInfo.getPageSize());
        datatablesResponsePageModel.setRecordsTotal((int)pageInfo.getTotal());
        datatablesResponsePageModel.setDraw(newsRequestPageModel.getDraw());
        datatablesResponsePageModel.setData(this.changeToNewsListPageModel(newsList));

        return datatablesResponsePageModel;
    }


    /******************************** 私有方法：转换新闻为页面视图model ************************************/

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


}
