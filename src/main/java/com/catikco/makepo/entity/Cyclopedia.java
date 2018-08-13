package com.catikco.makepo.entity;

import java.util.Date;

public class Cyclopedia {
    private Integer id;

    private String cyclopediaTitleImage;

    private String cyclopediaContentImagesFileid;

    private String title;

    private String keywords;

    private String description;

    private String cyclopediaResources;

    private Integer views;

    private String cyclopediaUrl;

    private Date cyclopediaCreateTime;

    private Byte cyclopediaType;

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

    public String getCyclopediaTitleImage() {
        return cyclopediaTitleImage;
    }

    public void setCyclopediaTitleImage(String cyclopediaTitleImage) {
        this.cyclopediaTitleImage = cyclopediaTitleImage == null ? null : cyclopediaTitleImage.trim();
    }

    public String getCyclopediaContentImagesFileid() {
        return cyclopediaContentImagesFileid;
    }

    public void setCyclopediaContentImagesFileid(String cyclopediaContentImagesFileid) {
        this.cyclopediaContentImagesFileid = cyclopediaContentImagesFileid == null ? null : cyclopediaContentImagesFileid.trim();
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

    public String getCyclopediaResources() {
        return cyclopediaResources;
    }

    public void setCyclopediaResources(String cyclopediaResources) {
        this.cyclopediaResources = cyclopediaResources == null ? null : cyclopediaResources.trim();
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getCyclopediaUrl() {
        return cyclopediaUrl;
    }

    public void setCyclopediaUrl(String cyclopediaUrl) {
        this.cyclopediaUrl = cyclopediaUrl == null ? null : cyclopediaUrl.trim();
    }

    public Date getCyclopediaCreateTime() {
        return cyclopediaCreateTime;
    }

    public void setCyclopediaCreateTime(Date cyclopediaCreateTime) {
        this.cyclopediaCreateTime = cyclopediaCreateTime;
    }

    public Byte getCyclopediaType() {
        return cyclopediaType;
    }

    public void setCyclopediaType(Byte cyclopediaType) {
        this.cyclopediaType = cyclopediaType;
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