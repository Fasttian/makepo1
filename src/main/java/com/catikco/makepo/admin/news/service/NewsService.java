package com.catikco.makepo.admin.news.service;

import com.catikco.makepo.admin.common.DatatablesRequestPageModel;
import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.news.model.NewsListPageModel;
import com.catikco.makepo.admin.news.model.NewsRequestPageModel;
import org.springframework.stereotype.Service;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/1/2018  14:18
 * Description：
 */
public interface NewsService {

    /**
     * 获取新闻列表
     * @param newsRequestPageModel
     * @return
     */
    public DatatablesResponsePageModel<NewsListPageModel> getNewsList(NewsRequestPageModel newsRequestPageModel);
}
