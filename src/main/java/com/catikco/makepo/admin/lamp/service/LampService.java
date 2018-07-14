package com.catikco.makepo.admin.lamp.service;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.lamp.model.LampEditPageModel;
import com.catikco.makepo.admin.lamp.model.LampListPageModel;
import com.catikco.makepo.admin.lamp.model.LampRequestPageModel;

import javax.servlet.http.HttpServletResponse;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:22
 * Description：
 */
public interface LampService  {
    /**
     * 加载产品列表
     * @param lampRequestPageModel
     * @return
     */
    public DatatablesResponsePageModel<LampListPageModel> getLampList(LampRequestPageModel lampRequestPageModel);

    /**
     *
     * @param lampEditPageModel 编辑框页面model
     * @param response  响应页面请求
     */
    public int saveLamp(LampEditPageModel lampEditPageModel, HttpServletResponse response);

    /**
     * 加载产品到编辑框
     * @param id
     * @return
     */
    public LampEditPageModel loadLamp(Integer id);
}
