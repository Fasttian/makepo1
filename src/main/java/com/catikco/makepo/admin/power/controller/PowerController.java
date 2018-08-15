package com.catikco.makepo.admin.power.controller;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.power.model.PowerEditPageModel;
import com.catikco.makepo.admin.power.model.PowerRequestPageModel;
import com.catikco.makepo.admin.power.service.PowerService;
import com.catikco.makepo.model.CallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:26
 * Description：
 */
@Controller(value = "admin.powerController")
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

    /**
     * 加载编辑框
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/edit-power")
    public String edit(HttpServletRequest request,Integer id){
        PowerEditPageModel powerEditPageModel = null;
        if(!"".equals(id) || null != id)
            powerEditPageModel = powerService.loadPower(id);
        if(null != powerEditPageModel)
            request.setAttribute("powerEditPageModel",powerEditPageModel);

        return "admin/power/edit-power";
    }

    @RequestMapping(value = "save-power",method = RequestMethod.POST)
    @ResponseBody
    public CallResult<String> save(PowerEditPageModel powerEditPageModel, HttpServletResponse response){
        CallResult<String> result = new CallResult<>();
        if(1 == powerService.savePower(powerEditPageModel,response)){
            result.setCode("succeed");
            result.setData("保存成功，准备返回新闻列表！");
        }else {
            result.setCode("error");
            result.setData("保存失败");
        }
        return result;
    }


    @RequestMapping(value = "delete-power", method = RequestMethod.POST)
    @ResponseBody
    public CallResult<String> delete(Integer id){
        CallResult<String> result = new CallResult<>();
        if(1 == powerService.deletePower(id)){
            result.setCode("succeed");
            result.setData("删除成功！");
        }else {
            result.setCode("error");
            result.setData("删除失败");
        }

        return result;
    }

}
