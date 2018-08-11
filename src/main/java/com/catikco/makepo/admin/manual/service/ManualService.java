package com.catikco.makepo.admin.manual.service;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.manual.model.ManualListPageModel;
import com.catikco.makepo.admin.manual.model.ManualRequestPageModel;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 18:12
 * Description：
 */
public interface ManualService {

    /**
     * 加载列表
     * @param manualRequestPageModel
     * @return
     */
    public DatatablesResponsePageModel<ManualListPageModel> getManualList(ManualRequestPageModel manualRequestPageModel);


}
