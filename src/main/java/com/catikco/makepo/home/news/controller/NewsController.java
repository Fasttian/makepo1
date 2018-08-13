package com.catikco.makepo.home.news.controller;

import com.catikco.makepo.entity.LampWithBLOBs;
import com.catikco.makepo.entity.NewsWithBLOBs;
import com.catikco.makepo.home.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
        queryCriteria.put("newsType",newsType);

        request.setAttribute("newsListPageModel",newsService.getNewsList(queryCriteria));
        request.setAttribute("newsType",newsType);

        return "home/news/news-list";
    }

    //按分页条件查询
    @RequestMapping("/newsListByPage")
    public String newsListByPage(HttpServletRequest request,Integer pageNum,Integer newsType){
        Map<String,Object> queryCriteria = new HashMap<>();
        queryCriteria.put("pageNum",pageNum);
        queryCriteria.put("newsType",newsType);

        request.setAttribute("newsType",newsType);

        request.setAttribute("newsListPageModel",newsService.getNewsList(queryCriteria));
        return "home/news/news-list-content";

    }



    @RequestMapping("/newsDetail")
    public String VisitProductPageDetail(HttpServletRequest request,Integer id){
        NewsWithBLOBs newsWithBLOBs = new NewsWithBLOBs();
        newsWithBLOBs = newsService.getById(id);

        request.setAttribute("newsWithBLOBs",newsWithBLOBs);

        return "home/news/news-detail";
    }
}

