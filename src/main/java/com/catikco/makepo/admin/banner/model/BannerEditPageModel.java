package com.catikco.makepo.admin.banner.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-17 10:30
 * Description：
 */
public class BannerEditPageModel {


    private Integer id;
    private String title;
    private String description;
    private MultipartFile multipartFile;
    private Date bannerCreateTime;

    public Date getBannerCreateTime() {
        return bannerCreateTime;
    }

    public void setBannerCreateTime(Date bannerCreateTime) {
        this.bannerCreateTime = bannerCreateTime;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
