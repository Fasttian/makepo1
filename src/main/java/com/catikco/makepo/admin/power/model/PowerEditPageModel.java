package com.catikco.makepo.admin.power.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:26
 * Description：
 */
public class PowerEditPageModel {
    private Integer id;     //主键
    private String model;   //型号
    private String power;   //功率
    private String input;   //输入电压
    private String output;  //输出电压
    private String size;    //尺寸
    private String title;   //产品内容标题
    private String keywords;    //关键字
    private String description; //产品介绍
    private String productUrl;  //产品链接
    private String remark;      // 备注
    private MultipartFile titImage;                 //电源图片
    private Date productCreateTime;                 //产品发布时间
    private Byte productType;           //产品类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public MultipartFile getTitImage() {
        return titImage;
    }

    public void setTitImage(MultipartFile titImage) {
        this.titImage = titImage;
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
}
