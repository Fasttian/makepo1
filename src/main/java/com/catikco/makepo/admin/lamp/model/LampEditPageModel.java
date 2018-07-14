package com.catikco.makepo.admin.lamp.model;

import java.util.Date;

/**
 * Create By: Tianjiaxing @Gui Yang
 * Time: 7/8/2018  14:20
 * Description：
 */
public class LampEditPageModel {

    private Integer id;

    private Integer productTitleImageFileid;

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

    private Byte productType;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
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
}
