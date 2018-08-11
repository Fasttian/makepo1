package com.catikco.makepo.home.lamp.controller;

import com.catikco.makepo.home.lamp.service.LampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/6/26  下午6:51
 * Description：
 */
@Controller
@RequestMapping ("/")
public class ProductsController {
    @Autowired
    private LampService lampService;

    @RequestMapping ("/productsAll")
    public String VisitProductPage(HttpServletRequest request){
        request.setAttribute("lampListPageModel", lampService.getLampList(null));

        return "home/lamp/lamp";
    }

    //按分页条件查询
    @RequestMapping("/lampListByPage")
    public String lampListByPage(HttpServletRequest request, Integer pageNum){
        Map<String,Object> queryCriteria = new HashMap<>();
        queryCriteria.put("pageNum", pageNum);

        request.setAttribute("lampListPageModel", lampService.getLampList(queryCriteria));

        return "home/lamp/lamp-list-content";
    }

    @RequestMapping("/ProductPageDetail")
    public String VisitProductPageDetail(){
        return "home/lamp/productDetail";
    }
}
