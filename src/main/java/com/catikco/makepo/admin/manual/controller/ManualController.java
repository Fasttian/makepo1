package com.catikco.makepo.admin.manual.controller;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.manual.model.ManualListPageModel;
import com.catikco.makepo.admin.manual.model.ManualRequestPageModel;
import com.catikco.makepo.admin.manual.service.ManualService;
import com.catikco.makepo.model.CallResult;
import com.catikco.makepo.oss.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 17:39
 * Description：
 */
@Controller(value = "admin.ManualController")
@RequestMapping
public class ManualController {

    @Autowired
    private ManualService manualService;

    @Autowired
    private FileStorageService fileStorageService;

    @RequestMapping("manual-list")
    public String manualInit(){
        return "admin/manual/manual-list";
    }

    @RequestMapping("/save-manual-file")
    @ResponseBody
    public CallResult<String> saveFiles(MultipartFile titImage, HttpServletResponse response){
        CallResult<String> result = new CallResult<>();
        if(null != fileStorageService.uploads(titImage,response,true,2)){
            result.setCode("succeed");
            result.setData("上传成功，准备刷新列表列表！");
        }else {
            result.setCode("error");
            result.setData("上传失败，请重试！");
        }
        return result;

    }

    @RequestMapping("load-manual-list")
    @ResponseBody
    public DatatablesResponsePageModel<ManualListPageModel> loadList(ManualRequestPageModel manualRequestPageModel){
        return manualService.getManualList(manualRequestPageModel);
    }

    @RequestMapping(value = "delete-manual", method = RequestMethod.POST)
    @ResponseBody
    public CallResult<String> delete(Integer id){
        CallResult<String> result = new CallResult<>();
        if(1 == fileStorageService.delete(id)){
            result.setCode("succeed");
            result.setData("删除成功！");
        }else {
            result.setCode("error");
            result.setData("保存失败");
        }
        return result;
    }

    /**
     * 下载
     * @param id
     * @param response
     */
    @RequestMapping("download-file")
    public void download(Integer id,HttpServletResponse response) throws IOException {
        fileStorageService.download(id,response);
    }



}
