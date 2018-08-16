package com.catikco.makepo.admin.lamp.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * Create By: Tianjiaxing @Gui Yang
 * Time: 7/8/2018  14:20
 * Description：
 */
public class LampEditPageModel {

    private Integer id;

    private MultipartFile titImage;

    private String model;

    private String voltage;

    private String power;

    private String lumen;

    private String powerFactor;

    private String size;

    private String material;

    private String title;

    private String keywords;

    private String description;   //产品介绍

    private String productUrl;

    private Integer views;

    private Byte productType;

    private Date productCreateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MultipartFile getTitImage() {
        return titImage;
    }

    public void setTitImage(MultipartFile titImage) {
        this.titImage = titImage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getLumen() {
        return lumen;
    }

    public void setLumen(String lumen) {
        this.lumen = lumen;
    }

    public String getPowerFactor() {
        return powerFactor;
    }

    public void setPowerFactor(String powerFactor) {
        this.powerFactor = powerFactor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Byte getProductType() {
        return productType;
    }

    public void setProductType(Byte productType) {
        this.productType = productType;
    }

    public Date getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(Date productCreateTime) {
        this.productCreateTime = productCreateTime;
    }
}
