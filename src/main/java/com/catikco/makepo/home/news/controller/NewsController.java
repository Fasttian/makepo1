package com.catikco.makepo.home.news.controller;

import com.catikco.makepo.home.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/6/26  下午9:15
 * Description：
 */

@Controller
@RequestMapping("/")
public class NewsController {

    @Autowired
    private NewsService newsService;


    @RequestMapping("/newsList")
    public String VisitNewsList(HttpServletRequest request,Integer newsType){
        Map<String,Object> queryCriteria = new HashMap<>();
        //queryCriteria.put("newsType",(Object) 1);

        request.setAttribute("newsListPageModel",newsService.getNewsList(queryCriteria));

        return "home/newsList";
    }

    @RequestMapping("/newsDetail")
    public String VisitNewsDetail(){
        return "home/newsDetail";
    }
}

