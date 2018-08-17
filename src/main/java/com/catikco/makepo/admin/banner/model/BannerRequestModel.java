package com.catikco.makepo.admin.banner.model;

import com.catikco.makepo.admin.common.DatatablesRequestPageModel;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-17 10:30
 * Description：
 */
public class BannerRequestModel extends DatatablesRequestPageModel {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
