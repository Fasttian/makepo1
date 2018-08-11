package com.catikco.makepo.home.lamp.service;

import com.catikco.makepo.home.lamp.model.LampListPageModel;

import java.util.Map;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/8/11  下午4:49
 * Description：
 */

public interface LampService {
    /**
     * 根据查询条件查产品
     * @param queryCriteria
     * @return
     */

    public LampListPageModel getLampList(Map<String, Object> queryCriteria);
}
