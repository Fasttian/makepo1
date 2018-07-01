package com.catikco.makepo.entity;

import java.util.Date;

public class File {
    private Integer id;

    private String filesize;

    private String fileprefix;

    private String filesuffix;

    private String filedesc;

    private String filestatus;

    private String filepath;

    private Date cretetime;

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

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize == null ? null : filesize.trim();
    }

    public String getFileprefix() {
        return fileprefix;
    }

    public void setFileprefix(String fileprefix) {
        this.fileprefix = fileprefix == null ? null : fileprefix.trim();
    }

    public String getFilesuffix() {
        return filesuffix;
    }

    public void setFilesuffix(String filesuffix) {
        this.filesuffix = filesuffix == null ? null : filesuffix.trim();
    }

    public String getFiledesc() {
        return filedesc;
    }

    public void setFiledesc(String filedesc) {
        this.filedesc = filedesc == null ? null : filedesc.trim();
    }

    public String getFilestatus() {
        return filestatus;
    }

    public void setFilestatus(String filestatus) {
        this.filestatus = filestatus == null ? null : filestatus.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
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
}