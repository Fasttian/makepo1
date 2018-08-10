package com.catikco.makepo.home.contactUs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/6/26  下午10:00
 * Description：
 */
@Controller
@RequestMapping("/")
public class contactUsController {

    @RequestMapping("/contactUs")
    public String visitContactUs(){
        return "home/contact/contact";
    }
}
