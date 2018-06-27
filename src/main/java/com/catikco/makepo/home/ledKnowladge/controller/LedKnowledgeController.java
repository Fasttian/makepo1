package com.catikco.makepo.home.ledKnowladge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/6/26  下午9:28
 * Description：
 */

@Controller
@RequestMapping("/")
public class LedKnowledgeController {

    @RequestMapping("/knowledge")
    public String VisitLedKnowledge() {
        return ("home/ledKnowledge");
    }

    @RequestMapping("/knowledgeDetail")
    public String VisitLedKnowledgeDetail(){
        return ("/home/newsDetail");
    }
}
