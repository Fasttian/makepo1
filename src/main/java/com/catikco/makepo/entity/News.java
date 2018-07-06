package com.catikco.makepo.entity;

import java.util.Date;

public class News {
    private Integer id;

    private Integer newstitleimagefileid;

    private String newscontentimagesfileid;

    private String title;

    private String keywords;

    private String decription;

    private String newsresources;

    private Integer views;

    private String newsurl;

    private Date newscreatetime;

    private Byte newstype;

    private Date createtime;

    private Date updatatime;

    private Integer createby;

    private Integer updataby;

    private String remark;

    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewstitleimagefileid() {
        return newstitleimagefileid;
    }

    public void setNewstitleimagefileid(Integer newstitleimagefileid) {
        this.newstitleimagefileid = newstitleimagefileid;
    }

    public String getNewscontentimagesfileid() {
        return newscontentimagesfileid;
    }

    public void setNewscontentimagesfileid(String newscontentimagesfileid) {
        this.newscontentimagesfileid = newscontentimagesfileid == null ? null : newscontentimagesfileid.trim();
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

    public String getNewsresources() {
        return newsresources;
    }

    public void setNewsresources(String newsresources) {
        this.newsresources = newsresources == null ? null : newsresources.trim();
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getNewsurl() {
        return newsurl;
    }

    public void setNewsurl(String newsurl) {
        this.newsurl = newsurl == null ? null : newsurl.trim();
    }

    public Date getNewscreatetime() {
        return newscreatetime;
    }

    public void setNewscreatetime(Date newscreatetime) {
        this.newscreatetime = newscreatetime;
    }

    public Byte getNewstype() {
        return newstype;
    }

    public void setNewstype(Byte newstype) {
        this.newstype = newstype;
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
}