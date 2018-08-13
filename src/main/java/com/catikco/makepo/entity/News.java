package com.catikco.makepo.entity;

import java.util.Date;

public class News {
    private Integer id;

    private String newsTitleImage;

    private String newsContentImagesFileid;

    private String title;

    private String keywords;

    private String description;

    private String newsResources;

    private Integer views;

    private String newsUrl;

    private Date newsCreateTime;

    private Byte newsType;

    private Date createTime;

    private Date updateTime;

    private Integer createBy;

    private Integer updateBy;

    private String remark;

    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsTitleImage() {
        return newsTitleImage;
    }

    public void setNewsTitleImage(String newsTitleImage) {
        this.newsTitleImage = newsTitleImage == null ? null : newsTitleImage.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
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