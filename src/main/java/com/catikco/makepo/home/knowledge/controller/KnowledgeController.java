package com.catikco.makepo.home.knowledge.controller;

import com.catikco.makepo.entity.CyclopediaWithBLOBs;
import com.catikco.makepo.home.knowledge.service.KnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/6/26  下午9:28
 * Description：
 */

@Controller
@RequestMapping
public class KnowledgeController {

    @Autowired
    private KnowledgeService knowledgeService;

    @RequestMapping("/knowledge-list")
    public String VisitLedKnowledge(HttpServletRequest request) {

        request.setAttribute("knowledgeListPageModel", knowledgeService.getKnowledgeList(null));

        return ("home/knowledge/knowledge-list");
    }

    @RequestMapping("/knowledgeListByPage")
    public String knowledgeListByPage(HttpServletRequest request, Integer pageNum) {
        Map<String, Object> queryCriteria = new HashMap<>();
        queryCriteria.put("pageNum", pageNum);

        request.setAttribute("knowledgeListPageModel", knowledgeService.getKnowledgeList(queryCriteria));

        return "home/knowledge/knowledge-list-content";
    }

    @RequestMapping("/knowledgeDetail")
    public String VisitLedKnowledgeDetail(HttpServletRequest request, Integer id) {
        CyclopediaWithBLOBs cyclopediaWithBLOBs = new CyclopediaWithBLOBs();
        cyclopediaWithBLOBs = knowledgeService.getById(id);

        request.setAttribute("cyclopediaWithBLOBs",cyclopediaWithBLOBs);

        return ("/home/knowledge/knowledge-detail");
    }
}
