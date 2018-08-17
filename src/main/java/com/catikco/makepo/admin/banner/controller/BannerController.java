package com.catikco.makepo.admin.banner.controller;

import com.catikco.makepo.admin.banner.model.BannerEditPageModel;
import com.catikco.makepo.admin.banner.model.BannerRequestModel;
import com.catikco.makepo.admin.banner.service.BannerService;
import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.entity.Banner;
import com.catikco.makepo.model.CallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-17 11:42
 * Description：
 */
@RequestMapping
@Controller(value = "home.bannerController")
public class BannerController {

    @Autowired
    private BannerService bannerService;


    @RequestMapping("banner-list")
    public String initBanner(){
        return "admin/banner/banner-list";
    }

    @RequestMapping("load-banner-list")
    @ResponseBody
    public DatatablesResponsePageModel loadList(BannerRequestModel bannerRequestModel){
        return bannerService.getList(bannerRequestModel);
    }

    @RequestMapping("edit-banner")
    public String edit(HttpServletRequest request,Integer id){
        BannerEditPageModel bannerEditPageModel = null;
        if(!"".equals(id)){
            bannerEditPageModel = bannerService.load(id);
            request.setAttribute("bannerEditPageModel",bannerEditPageModel);
        }

        return "admin/banner/edit-banner";

    }

    @RequestMapping(value = "/save-banner", method = RequestMethod.POST)
    @ResponseBody
    public CallResult<String> save(HttpServletResponse response, BannerEditPageModel bannerEditPageModel){
        CallResult<String> result = new CallResult<>();
        if(1 == bannerService.save(bannerEditPageModel,response)){
            result.setCode("succeed");
            result.setData("保存成功，准备返回横幅列表！");
        }else {
            result.setCode("error");
            result.setData("保存失败");
        }

        return result;
    }

    @RequestMapping(value = "delete-banner", method = RequestMethod.POST)
    @ResponseBody
    public CallResult<String> delete(Integer id){
        CallResult<String> result = new CallResult<>();
        if(1 == bannerService.delete(id)){
            result.setCode("succeed");
            result.setData("删除成功！");
        }else {
            result.setCode("error");
            result.setData("删除失败");
        }

        return result;
    }

}
