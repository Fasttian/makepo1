package com.catikco.makepo.admin.power.service;

import com.catikco.makepo.admin.common.DatatablesRequestPageModel;
import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.power.model.PowerEditPageModel;
import com.catikco.makepo.admin.power.model.PowerRequestPageModel;
import org.springframework.stereotype.Service;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:28
 * Description：
 */

public interface PowerService {

    /**
     * 获取电源列表
     * @param powerRequestPageModel
     * @return
     */
    public DatatablesResponsePageModel getPowerList(PowerRequestPageModel powerRequestPageModel);

    /**
     * 加载电源编辑页面
     * @param id
     * @return
     */
    public PowerEditPageModel loadPower(Integer id);

    /**
     * 删除电源
     * @param id
     * @return
     */
    public Integer deletePower(Integer id);

}
