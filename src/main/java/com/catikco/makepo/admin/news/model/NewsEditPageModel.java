package com.catikco.makepo.admin.news.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/2/2018  11:10
 * Description：新闻编辑页面model
 */
public class NewsEditPageModel {

    private Integer id;                             //新闻id

    private String title;                           //新闻标题

    private String keywords;                        //新闻关键字

    private String decription;                      //新闻描述

    private String newsResources;                   //新闻来源

    private Date createTime;                        //新闻发布时间

    private String newsUrl;                         //新闻链接（预留属性：以后在后台新闻列表点击跳转到新闻页面功能的实现）

    private MultipartFile multipartFile;            //新闻要图片

    private String digest;                          //新闻摘要

    private String content;                         //新闻内容

    private Byte newsType;                          //新闻类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getNewsResources() {
        return newsResources;
    }

    public void setNewsResources(String newsResources) {
        this.newsResources = newsResources;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getNewsType() {
        return newsType;
    }

    public void setNewsType(Byte newsType) {
        this.newsType = newsType;
    }
}
