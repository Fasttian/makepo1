package com.catikco.makepo.admin.cyclopedia.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 16:09
 * Description：
 */
public class CyclopediaEditPageModel {

    private Integer id;                             //百科id

    private String title;                           //百科标题

    private String keywords;                        //百科关键字

    private String description;                      //百科描述

    private String cyclopediaResources;                   //百科来源

    private Date cyclopediaCreateTime;                     //百科发布时间

    private String cyclopediaUrl;                         //百科链接（预留属性：以后在后台百科列表点击跳转到新闻页面功能的实现）

    private MultipartFile titImage;                 //百科概要图片

    private String digest;                          //百科摘要

    private String content;                         //百科内容

    private Byte cyclopediaType;                          //百科类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCyclopediaResources() {
        return cyclopediaResources;
    }

    public void setCyclopediaResources(String cyclopediaResources) {
        this.cyclopediaResources = cyclopediaResources;
    }

    public Date getCyclopediaCreateTime() {
        return cyclopediaCreateTime;
    }

    public void setCyclopediaCreateTime(Date cyclopediaCreateTime) {
        this.cyclopediaCreateTime = cyclopediaCreateTime;
    }

    public String getCyclopediaUrl() {
        return cyclopediaUrl;
    }

    public void setCyclopediaUrl(String cyclopediaUrl) {
        this.cyclopediaUrl = cyclopediaUrl;
    }

    public MultipartFile getTitImage() {
        return titImage;
    }

    public void setTitImage(MultipartFile titImage) {
        this.titImage = titImage;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getCyclopediaType() {
        return cyclopediaType;
    }

    public void setCyclopediaType(Byte cyclopediaType) {
        this.cyclopediaType = cyclopediaType;
    }
}
