package com.catikco.makepo.entity;

import java.util.Date;

public class Power {
    private Integer id;

    private Integer productTitleImageFileid;

    private String productContentImagesFileid;

    private Double power;

    private Double input;

    private Double output;

    private String size;

    private String title;

    private String keywords;

    private String decription;

    private String productUrl;

    private Integer views;

    private Date productCreateTime;

    private Byte productType;

    private Date creteTime;

    private Date upDataTime;

    private Integer createBy;

    private Integer upDataBy;

    private String remark;

    private Boolean deleted;

    private String model;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductTitleImageFileid() {
        return productTitleImageFileid;
    }

    public void setProductTitleImageFileid(Integer productTitleImageFileid) {
        this.productTitleImageFileid = productTitleImageFileid;
    }

    public String getProductContentImagesFileid() {
        return productContentImagesFileid;
    }

    public void setProductContentImagesFileid(String productContentImagesFileid) {
        this.productContentImagesFileid = productContentImagesFileid == null ? null : productContentImagesFileid.trim();
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = input;
    }

    public Double getOutput() {
        return output;
    }

    public void setOutput(Double output) {
        this.output = output;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
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

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl == null ? null : productUrl.trim();
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Date getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(Date productCreateTime) {
        this.productCreateTime = productCreateTime;
    }

    public Byte getProductType() {
        return productType;
    }

    public void setProductType(Byte productType) {
        this.productType = productType;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }
}