package com.catikco.makepo.home.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/6/26  下午9:15
 * Description：
 */

@Controller
@RequestMapping("/")
public class NewsController {

    @RequestMapping("/newsList")
    public String VisitNewsList(){
        return "home/newsList";
    }

    @RequestMapping("/newsDetail")
    public String VisitNewsDetail(){
        return "home/newsDetail";
    }
}

