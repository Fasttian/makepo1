package com.catikco.makepo.admin.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/1/2018  14:16
 * Description：
 */
@Controller(value = "admin.NewsController")
@RequestMapping
public class NewsController {

    /**
     * 后台管理初始页
     * @return
     */
    @RequestMapping("newsPost")
    public String adminInit(){
        return "admin/index";
    }

    /**
     * 新闻管理列表页
     * @return
     */
    @RequestMapping("newsInit")
    public String newsInit(){
        return "admin/news-init";
    }
}
