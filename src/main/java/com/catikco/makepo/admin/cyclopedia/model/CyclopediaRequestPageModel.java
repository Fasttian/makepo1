package com.catikco.makepo.admin.cyclopedia.model;

import com.catikco.makepo.admin.common.DatatablesRequestPageModel;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 16:09
 * Description：
 */
public class CyclopediaRequestPageModel extends DatatablesRequestPageModel {

    /**************************** 查询条件 *******************************************/
    private String title;   //按百科标题查询

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
