package com.catikco.makepo.home.power.controller;

import com.catikco.makepo.entity.LampWithBLOBs;
import com.catikco.makepo.entity.PowerWithBLOBs;
import com.catikco.makepo.home.power.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-12 12:09
 * Description：
 */
@Controller
@RequestMapping("/")
public class PowerController {

    @Autowired
    private PowerService powerService;

    @RequestMapping ("/powerList")
    public String powerList(HttpServletRequest request){
        request.setAttribute("powerListPageModel", powerService.getPowerList(null));

        return "home/power/power-list";
    }

    //按分页条件查询
    @RequestMapping("/powerListByPage")
    public String lampListByPage(HttpServletRequest request, Integer pageNum,Integer productType){
        Map<String,Object> queryCriteria = new HashMap<>();
        queryCriteria.put("pageNum", pageNum);
        queryCriteria.put("productType",productType);

        request.setAttribute("powerListPageModel", powerService.getPowerList(queryCriteria));

        return "home/power/power-list-content";
    }

    @RequestMapping("/powerDetail")
    public String VisitProductPageDetail(HttpServletRequest request,Integer id){
        PowerWithBLOBs powerWithBLOBs = new PowerWithBLOBs();
        powerWithBLOBs = powerService.getById(id);

        request.setAttribute("powerWithBLOBs",powerWithBLOBs);

        return "home/power/power-detail";
    }

    @RequestMapping("/powerDetailByModal")
    @ResponseBody
    public PowerWithBLOBs VisitProductPageDetailByModal(Integer id){
        PowerWithBLOBs  powerWithBLOBs = powerService.getById(id);
        return powerWithBLOBs;
    }
}
