package com.catikco.makepo.home.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("")
    public String VisitHomePage(){
        return "home/index";
    }
}
