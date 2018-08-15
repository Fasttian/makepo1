package com.catikco.makepo.admin.cyclopedia.controller;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.cyclopedia.model.CyclopediaEditPageModel;
import com.catikco.makepo.admin.cyclopedia.model.CyclopediaListPageModel;
import com.catikco.makepo.admin.cyclopedia.model.CyclopediaRequestPageModel;
import com.catikco.makepo.admin.cyclopedia.service.CyclopediaService;
import com.catikco.makepo.model.CallResult;
import com.catikco.makepo.oss.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 16:09
 * Description：
 */
@Controller(value = "admin.cyclopediaController")
@RequestMapping
public class CyclopediaController {

    @Autowired
    private CyclopediaService cyclopediaService;

    @Autowired
    private FileStorageService fileStorageService;


    /**
     * 新闻管理页面
     * @return
     */
    @RequestMapping("cyclopedia-list")
    public String cyclopediaInit(){
        return "admin/cyclopedia/cyclopedia-list";
    }

    /**
     * 加载新闻列表
     * @return
     */
    @RequestMapping("load-cyclopedia-list")
    @ResponseBody
    public DatatablesResponsePageModel<CyclopediaListPageModel> loadList(CyclopediaRequestPageModel cyclopediaRequestPageModel){
        return cyclopediaService.getCyclopediaList(cyclopediaRequestPageModel);
    }


    /**
     * 初始化新闻编辑/添加页面
     * @return
     */
    @RequestMapping("edit-cyclopedia")
    public String edit(Integer id, HttpServletRequest request){
        CyclopediaEditPageModel cyclopediaEditPageModel = null;
        if(!"".equals(id) || null != id)
            cyclopediaEditPageModel = cyclopediaService.loadCyclopedia(id);
        if(null != cyclopediaEditPageModel)
             request.setAttribute("cyclopediaEditPageModel",cyclopediaEditPageModel);

        return "admin/cyclopedia/edit-cyclopedia";
    }

    /**
     *
     * @param cyclopediaEditPageModel 编辑页面model
     * @param response 响应页面请求
     */
    @RequestMapping(value = "/save-cyclopedia", method = RequestMethod.POST)
    @ResponseBody
    public CallResult<String> saveCyclopedia(CyclopediaEditPageModel cyclopediaEditPageModel, HttpServletResponse response){
        CallResult<String> result = new CallResult<>();
        if(1 == cyclopediaService.saveCyclopedia(cyclopediaEditPageModel,response)){
            result.setCode("succeed");
            result.setData("保存成功，准备返回新闻列表！");
        }else {
            result.setCode("error");
            result.setData("保存失败");
        }

        return result;

    }



    @RequestMapping(value = "delete-cyclopedia", method = RequestMethod.POST)
    @ResponseBody
    public CallResult<String> delete(Integer id){
        CallResult<String> result = new CallResult<>();
        if(1 == cyclopediaService.deleteCyclopedia(id)){
            result.setCode("succeed");
            result.setData("删除成功！");
        }else {
            result.setCode("error");
            result.setData("删除失败");
        }

        return result;
    }

    /**
     * 对富文本编辑器中的图片文件执行保存操作
     * @param multipartFile
     * @param response
     */
    @RequestMapping("/save-cyclopedia-file")
    public void saveFiles(@RequestParam("file")MultipartFile multipartFile, HttpServletResponse response){
       fileStorageService.uploads(multipartFile,response,false,null);
    }




}
