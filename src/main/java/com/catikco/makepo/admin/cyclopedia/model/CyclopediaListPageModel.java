package com.catikco.makepo.admin.cyclopedia.model;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;

import java.util.Date;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 16:09
 * Description：
 */
public class CyclopediaListPageModel {
    private Integer id;                             //百科id
    private String title;                           //百科标题
    private String cyclopediaCreateTime;            //百科发布时间
    private Byte cyclopediaType;                    //百科类型
    private String cyclopediaResources;              //百科来源
    private String keywords;                        //关键字

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

    public String getCyclopediaCreateTime() {
        return cyclopediaCreateTime;
    }

    public void setCyclopediaCreateTime(String cyclopediaCreateTime) {
        this.cyclopediaCreateTime = cyclopediaCreateTime;
    }

    public Byte getCyclopediaType() {
        return cyclopediaType;
    }

    public void setCyclopediaType(Byte cyclopediaType) {
        this.cyclopediaType = cyclopediaType;
    }

    public String getCyclopediaResources() {
        return cyclopediaResources;
    }

    public void setCyclopediaResources(String cyclopediaResources) {
        this.cyclopediaResources = cyclopediaResources;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
