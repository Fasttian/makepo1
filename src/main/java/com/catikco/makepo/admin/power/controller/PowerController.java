package com.catikco.makepo.admin.power.controller;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.power.model.PowerRequestPageModel;
import com.catikco.makepo.admin.power.service.PowerService;
import com.catikco.makepo.model.CallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:26
 * Description：
 */
@Controller(value = "admin.power.powerconter")
@RequestMapping
public class PowerController {

    @Autowired
    private PowerService powerService;
    /**
     * 列表页
     * @return
     */
    @RequestMapping("/power-list")
    public String poerList(){
        return "admin/power/power-list";
    }

    @RequestMapping("/power-load-list")
    @ResponseBody
    public DatatablesResponsePageModel loadList(PowerRequestPageModel powerRequestPageModel){
        return  powerService.getPowerList(powerRequestPageModel);
    }
}
