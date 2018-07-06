package com.catikco.makepo.entity;

import java.util.Date;

public class Lamp {
    private Integer id;

    private Integer producttitleimagefileid;

    private String productcontentimagesfileid;

    private String model;

    private Double voltage;

    private Double power;

    private Double lumen;

    private String powerfactor;

    private String size;

    private String material;

    private String title;

    private String keywords;

    private String decription;

    private String producturl;

    private Integer views;

    private Date productcreatetime;

    private Byte producttype;

    private Date createtime;

    private Date updatatime;

    private Integer createby;

    private Integer updataby;

    private String remark;

    private Boolean deleted;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProducttitleimagefileid() {
        return producttitleimagefileid;
    }

    public void setProducttitleimagefileid(Integer producttitleimagefileid) {
        this.producttitleimagefileid = producttitleimagefileid;
    }

    public String getProductcontentimagesfileid() {
        return productcontentimagesfileid;
    }

    public void setProductcontentimagesfileid(String productcontentimagesfileid) {
        this.productcontentimagesfileid = productcontentimagesfileid == null ? null : productcontentimagesfileid.trim();
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

    public String getPowerfactor() {
        return powerfactor;
    }

    public void setPowerfactor(String powerfactor) {
        this.powerfactor = powerfactor == null ? null : powerfactor.trim();
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

    public String getProducturl() {
        return producturl;
    }

    public void setProducturl(String producturl) {
        this.producturl = producturl == null ? null : producturl.trim();
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Date getProductcreatetime() {
        return productcreatetime;
    }

    public void setProductcreatetime(Date productcreatetime) {
        this.productcreatetime = productcreatetime;
    }

    public Byte getProducttype() {
        return producttype;
    }

    public void setProducttype(Byte producttype) {
        this.producttype = producttype;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatatime() {
        return updatatime;
    }

    public void setUpdatatime(Date updatatime) {
        this.updatatime = updatatime;
    }

    public Integer getCreateby() {
        return createby;
    }

    public void setCreateby(Integer createby) {
        this.createby = createby;
    }

    public Integer getUpdataby() {
        return updataby;
    }

    public void setUpdataby(Integer updataby) {
        this.updataby = updataby;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}