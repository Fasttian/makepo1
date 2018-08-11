package com.catikco.makepo.home.aboutUs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/6/26  下午9:41
 * Description：
 */

@Controller
@RequestMapping("/")
public class AboutUsController {
    @RequestMapping("/aboutUs")
    public String VisitAboutUs (){
        return "home/about/about";
    }
}
