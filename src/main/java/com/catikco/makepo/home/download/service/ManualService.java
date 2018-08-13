package com.catikco.makepo.home.download.service;

import com.catikco.makepo.home.download.model.ManualListPageModel;

import java.util.Map;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-13 00:20
 * Description：
 */
public interface ManualService {

    public ManualListPageModel getList(Map<String,Object> queryCriteria);
}
