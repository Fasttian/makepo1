package com.catikco.makepo.home.news.service.impl;


import com.catikco.makepo.entity.NewsExample;
import com.catikco.makepo.entity.NewsWithBLOBs;
import com.catikco.makepo.home.news.model.NewsListPageModel;
import com.catikco.makepo.home.news.service.NewsService;
import com.catikco.makepo.mapper.NewsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-04 18:14
 * Description：
 */
@Service(value = "home.newsservice")
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public NewsListPageModel getNewsList(Map<String,Object> queryCriteria) {

        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();

        //排序方式
        newsExample.setOrderByClause("newsCreateTime"+" "+"asc");

        //按新闻类型查询
        Integer newsType = null;
        Integer pageNum = null;

        if(queryCriteria != null){
             newsType = (Integer) queryCriteria.get("newsType");
             pageNum = (Integer) queryCriteria.get("pageNum");
        }
        Integer startPage = 0;

        //查询条件
        if(null != newsType){
            criteria.andNewsTypeEqualTo((newsType.byteValue()));
        }
        if(null != pageNum)
            startPage = pageNum;

        //设置分页信息
        PageHelper.startPage(startPage,2);

        List<NewsWithBLOBs> newsWithBLOBsList = newsMapper.selectByExampleWithBLOBs(newsExample);
        //让pageInfo对象进行分页的处理
        PageInfo<NewsWithBLOBs> pageInfo = new PageInfo<>(newsWithBLOBsList);

        NewsListPageModel newsListPageModel = new NewsListPageModel();
        newsListPageModel.setCount(pageInfo.getPages());
        newsListPageModel.setCurrentPage(pageInfo.getPageNum());
        newsListPageModel.setNewsList(pageInfo.getList());
        newsListPageModel.setNextPage(pageInfo.getNextPage());
        newsListPageModel.setPrevPage(pageInfo.getPrePage());
        newsListPageModel.setNextShow(pageInfo.isHasNextPage());
        newsListPageModel.setPrevShow(pageInfo.isHasPreviousPage());

        return newsListPageModel;
    }

    /********************************** 私有方法 *******************************************/


}
