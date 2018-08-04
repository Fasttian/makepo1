package com.catikco.makepo.entity;

import java.util.Date;

public class Lamp {
    private Integer id;

    private Integer productTitleImageFileid;

    private String productContentImagesFileid;

    private String model;

    private Double voltage;

    private Double power;

    private Double lumen;

    private String powerFactor;

    private String size;

    private String material;

    private String title;

    private String keywords;

    private String decription;

    private String productUrl;

    private Integer views;

    private Date productCreateTime;

    private Byte productType;

    private Date createTime;

    private Date upDataTime;

    private Integer createBy;

    private Integer upDataBy;

    private String remark;

    private Boolean deleted;

    private Byte type;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Double getVoltage() {
        return voltage;
    }

    public void setVoltage(Double voltage) {
        this.voltage = voltage;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getLumen() {
        return lumen;
    }

    public void setLumen(Double lumen) {
        this.lumen = lumen;
    }

    public String getPowerFactor() {
        return powerFactor;
    }

    public void setPowerFactor(String powerFactor) {
        this.powerFactor = powerFactor == null ? null : powerFactor.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }
}