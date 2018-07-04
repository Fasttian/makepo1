package com.catikco.makepo.admin.news.model;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/2/2018  11:10
 * Description：新闻列表页面model
 */
public class NewsListPageModel  {
    private String title;       //新闻标题
    private String keywords;    //关键字

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
