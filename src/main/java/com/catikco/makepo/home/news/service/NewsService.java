package com.catikco.makepo.home.news.service;

import com.catikco.makepo.home.news.model.NewsListPageModel;

import java.util.Map;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-04 18:13
 * Description：
 */
public interface NewsService {


    /**
     * 根据查询条件查出新闻
     * @param queryCriteria
     * @return
     */
    public NewsListPageModel getNewsList(Map<String,Object> queryCriteria);

}
