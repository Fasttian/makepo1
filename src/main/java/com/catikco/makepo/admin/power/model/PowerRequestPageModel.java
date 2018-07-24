package com.catikco.makepo.admin.power.model;

import com.catikco.makepo.admin.common.DatatablesRequestPageModel;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:27
 * Description：
 */
public class PowerRequestPageModel extends DatatablesRequestPageModel {
    private String model;   //按电源型号查询

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
