package com.catikco.makepo.entity;

import java.util.Date;

public class Power {
    private Integer id;

    private Integer producttitleimagefileid;

    private String productcontentimagesfileid;

    private Double power;

    private Double input;

    private Double output;

    private String size;

    private String title;

    private String keywords;

    private String decription;

    private Date cretetime;

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

    public Date getCretetime() {
        return cretetime;
    }

    public void setCretetime(Date cretetime) {
        this.cretetime = cretetime;
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