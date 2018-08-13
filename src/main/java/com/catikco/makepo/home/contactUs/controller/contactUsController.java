package com.catikco.makepo.home.contactUs.controller;

import com.catikco.makepo.home.contactUs.model.ContactusPageModel;
import com.catikco.makepo.home.contactUs.service.ContactusService;
import com.catikco.makepo.model.CallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/6/26  下午10:00
 * Description：
 */
@Controller
@RequestMapping("/")
public class contactUsController {

    @Autowired
    private ContactusService contactusService;

    @RequestMapping("/contactUs")
    public String visitContactUs(){
        return "home/contact/contact";
    }

    @RequestMapping(value = "save-contactus", method = RequestMethod.POST)
    @ResponseBody
    public CallResult<String> save(ContactusPageModel contactusPageModel){
        CallResult<String> result = new CallResult<>();
        if(1 == contactusService.save(contactusPageModel)){
            result.setCode("succeed");
            result.setData("提交成功！");
        }else {
            result.setCode("error");
            result.setData("提交失败，请重试！");
        }
        return result;
    }


}
