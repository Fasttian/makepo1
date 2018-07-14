package com.catikco.makepo.admin.lamp.model;

import com.catikco.makepo.admin.common.DatatablesRequestPageModel;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:21
 * Description：
 */
public class LampRequestPageModel extends DatatablesRequestPageModel {

    private Integer id;

    private String model;

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
}
