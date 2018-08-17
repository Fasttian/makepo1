package com.catikco.makepo.admin.manual.model;

import java.util.Date;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 18:14
 * Description：
 */
public class ManualListPageModel {

    private Integer id;
    private String filePrefix;                           //手册名
    private String createTime;                        //上传时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilePrefix() {
        return filePrefix;
    }

    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
