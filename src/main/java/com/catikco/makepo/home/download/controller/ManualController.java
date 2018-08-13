package com.catikco.makepo.home.download.controller;

import com.catikco.makepo.home.download.service.ManualService;
import com.catikco.makepo.oss.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-13 00:30
 * Description：
 */
@Repository
@Controller(value = "home.manualController")
public class ManualController {

    @Autowired
    private ManualService manualService;

    @Autowired
    private FileStorageService fileStorageService;

    @RequestMapping("/manualList")
    public String download(HttpServletRequest request){
        request.setAttribute("manualListPageModel", manualService.getList(null));
        return "home/manual/manual-list";
    }

    //按分页条件查询
    @RequestMapping("/manualListByPage")
    public String lampListByPage(HttpServletRequest request, Integer pageNum){
        Map<String,Object> queryCriteria = new HashMap<>();
        queryCriteria.put("pageNum", pageNum);

        request.setAttribute("manualListPageModel", manualService.getList(queryCriteria));

        return "home/manual/manual-list-content";
    }

    @RequestMapping("download-manual")
    public void download(Integer id, HttpServletResponse response) throws IOException {
        fileStorageService.download(id,response);

    }

}
