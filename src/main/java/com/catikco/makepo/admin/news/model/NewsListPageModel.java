package com.catikco.makepo.admin.news.model;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;

import java.util.Date;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/2/2018  11:10
 * Description：新闻列表页面model
 */
public class NewsListPageModel  {
    private Integer id;                             //新闻id
    private String title;                           //新闻标题
    private String digest;                          //新闻摘要
    private Date newsCreateTime;                    //新闻发布时间
    private Byte newsType;                          //新闻类型
    private String newsResources;                   //新闻来源

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Date getNewsCreateTime() {
        return newsCreateTime;
    }

    public void setNewsCreateTime(Date newsCreateTime) {
        this.newsCreateTime = newsCreateTime;
    }

    public Byte getNewsType() {
        return newsType;
    }

    public void setNewsType(Byte newsType) {
        this.newsType = newsType;
    }

    public String getNewsResources() {
        return newsResources;
    }

    public void setNewsResources(String newsResources) {
        this.newsResources = newsResources;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
