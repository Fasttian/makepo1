package com.catikco.makepo.admin.news.model;

import com.catikco.makepo.admin.common.DatatablesRequestPageModel;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/2/2018  16:20
 * Description：
 */
public class NewsRequestPageModel extends DatatablesRequestPageModel {
    private String title;   //按新闻标题查询

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
