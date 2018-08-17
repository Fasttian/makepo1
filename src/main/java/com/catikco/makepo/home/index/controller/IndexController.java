package com.catikco.makepo.home.index.controller;

import com.catikco.makepo.entity.Banner;
import com.catikco.makepo.entity.LampWithBLOBs;
import com.catikco.makepo.entity.NewsWithBLOBs;
import com.catikco.makepo.home.index.model.BannerListPageModel;
import com.catikco.makepo.home.index.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-14 17:07
 * Description：
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private IndexService indexService;


    @RequestMapping("")
    public String VisitHomePage(HttpServletRequest request){

        //主页banner展示
        List<BannerListPageModel> bannerListPageModelList = indexService.getList();
        //主页新产品展示
        List<LampWithBLOBs> newLampList = indexService.findLamps();
        //主页产品分类展示，默认展示型号为G4/G9的灯饰
        List<LampWithBLOBs> lampWithBLOBsList = indexService.findLampsByType(null);
        //主页新闻展示
        List<NewsWithBLOBs> newsWithBLOBsList = indexService.findNews();

        request.setAttribute("bannerListPageModelList",bannerListPageModelList);
        request.setAttribute("newLampList",newLampList);
        request.setAttribute("lampWithBLOBsList",lampWithBLOBsList);
        request.setAttribute("newsWithBLOBsList",newsWithBLOBsList);

        return "home/index/index";
    }

    /**
     * 主页灯饰分类查询
     * @param request
     */
    @RequestMapping("getLampByType")
    public void getLampByType(HttpServletRequest request,Integer productType){
        List<LampWithBLOBs> lampWithBLOBsList = indexService.findLampsByType(productType);
        request.setAttribute("lampWithBLOBsList",lampWithBLOBsList);
    }

    /********************************** 私有方法 ******************************************************/
    private List<BannerListPageModel> changeToBannerListPageModel(List<Banner> bannerList){
        if(!(bannerList.size()>0))
            return null;

        List<BannerListPageModel> bannerListPageModelList = new ArrayList<>();
        for(Banner banner:bannerList){
            BannerListPageModel bannerListPageModel = new BannerListPageModel();
            bannerListPageModel.setBannerImage(banner.getBannerImage());
            bannerListPageModel.setDescription(banner.getDescription());
            bannerListPageModel.setTitle(banner.getTitle());
            bannerListPageModel.setId(banner.getId());
            bannerListPageModelList.add(bannerListPageModel);
        }
        return bannerListPageModelList;

    }
}
