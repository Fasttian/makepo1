package com.catikco.makepo.admin.manual.model;

import com.catikco.makepo.admin.common.DatatablesRequestPageModel;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 18:15
 * Description：
 */
public class ManualRequestPageModel extends DatatablesRequestPageModel {

    /**************************** 查询条件 *******************************************/
    private String filePrefix;   //手册名

    public String getFilePrefix() {
        return filePrefix;
    }

    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }
}
