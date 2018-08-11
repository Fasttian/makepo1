package com.catikco.makepo.admin.cyclopedia.service;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.cyclopedia.model.CyclopediaEditPageModel;
import com.catikco.makepo.admin.cyclopedia.model.CyclopediaListPageModel;
import com.catikco.makepo.admin.cyclopedia.model.CyclopediaRequestPageModel;

import javax.servlet.http.HttpServletResponse;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 16:09
 * Description：
 */

public interface CyclopediaService {

    /**
     * 加载新闻列表
     * @param cyclopediaRequestPageModel
     * @return
     */
    public DatatablesResponsePageModel<CyclopediaListPageModel> getCyclopediaList(CyclopediaRequestPageModel cyclopediaRequestPageModel);

    /**
     *
     * @param cyclopediaEditPageModel 编辑框页面model
     * @param response  响应页面请求
     */
    public int saveCyclopedia(CyclopediaEditPageModel cyclopediaEditPageModel, HttpServletResponse response);

    /**
     * 加载新闻到编辑框
     * @param id
     * @return
     */
    public CyclopediaEditPageModel loadCyclopedia(Integer id);

    public Integer deleteCyclopedia(Integer id);
}
