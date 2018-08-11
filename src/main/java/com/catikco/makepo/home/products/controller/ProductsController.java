package com.catikco.makepo.home.products.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/6/26  下午6:51
 * Description：
 */
@Controller
@RequestMapping ("/")
public class ProductsController {

    @RequestMapping ("/productsAll")
    public String VisitProductPage(){
        return "home/product/products";
    }

    @RequestMapping("/ProductPageDetail")
    public String VisitProductPageDetail(){
        return "home/product/productDetail";
    }
}
