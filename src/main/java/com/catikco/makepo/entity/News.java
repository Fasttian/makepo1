package com.catikco.makepo.entity;

import java.util.Date;

public class News {
    private Integer id;

    private Integer newsTitleImageFileid;

    private String newsContentImagesFileid;

    private String title;

    private String keywords;

    private String decription;

    private String newsResources;

    private Integer views;

    private String newsUrl;

    private Date newsCreateTime;

    private Byte newsType;

    private Date createTime;

    private Date upDataTime;

    private Integer createBy;

    private Integer upDataBy;

    private String remark;

    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewsTitleImageFileid() {
        return newsTitleImageFileid;
    }

    public void setNewsTitleImageFileid(Integer newsTitleImageFileid) {
        this.newsTitleImageFileid = newsTitleImageFileid;
    }

    public String getNewsContentImagesFileid() {
        return newsContentImagesFileid;
    }

    public void setNewsContentImagesFileid(String newsContentImagesFileid) {
        this.newsContentImagesFileid = newsContentImagesFileid == null ? null : newsContentImagesFileid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription == null ? null : decription.trim();
    }

    public String getNewsResources() {
        return newsResources;
    }

    public void setNewsResources(String newsResources) {
        this.newsResources = newsResources == null ? null : newsResources.trim();
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl == null ? null : newsUrl.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpDataTime() {
        return upDataTime;
    }

    public void setUpDataTime(Date upDataTime) {
        this.upDataTime = upDataTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Integer getUpDataBy() {
        return upDataBy;
    }

    public void setUpDataBy(Integer upDataBy) {
        this.upDataBy = upDataBy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}