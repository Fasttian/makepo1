package com.catikco.makepo.home.power.service;

import com.catikco.makepo.entity.PowerWithBLOBs;
import com.catikco.makepo.home.power.model.PowerListPageModel;

import java.util.Map;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-12 12:09
 * Description：
 */
public interface PowerService {

    public PowerListPageModel getPowerList(Map<String, Object> queryCriteria);

    public PowerWithBLOBs getById(Integer id);

}
