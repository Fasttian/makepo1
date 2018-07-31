package com.catikco.makepo.admin.lamp.controller;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.lamp.service.LampService;
import com.catikco.makepo.admin.lamp.model.LampEditPageModel;
import com.catikco.makepo.admin.lamp.model.LampListPageModel;
import com.catikco.makepo.admin.lamp.model.LampRequestPageModel;
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
import java.util.List;

import static com.catikco.makepo.common.StringUtils.cutContentFileId;
import static com.catikco.makepo.common.StringUtils.parseContentFileId;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:19
 * Description：
 */
@Controller(value = "admin.LampController")
@RequestMapping
public class LampController {

    @Autowired
    private LampService lampService;

    @Autowired
    private FileStorageService fileStorageService;


//    /**
//     * 后台管理初始页
//     * @return
//     */
//    @RequestMapping("admin-init")
//    public String adminInit(HttpServletResponse response){
//        return "admin/index";😀
//    } 

    /**
     * 灯饰管理页面
     * @return
     */
    @RequestMapping("lamp-list")
    public String lampInit(){
        return "admin/lamp/lamp-list";
    }

    /**
     * 加载灯饰列表
     * @return
     */
    @RequestMapping("load-lamp-list")
    @ResponseBody
    public DatatablesResponsePageModel<LampListPageModel> loadList(LampRequestPageModel lampRequestPageModel){
        return lampService.getLampList(lampRequestPageModel);
    }


    /**
     * 初始化灯饰编辑/添加页面
     * @return
     */
    @RequestMapping("edit-lamp")
    public String edit(Integer id, HttpServletRequest request){
        LampEditPageModel lampEditPageModel = null;
        if(!"".equals(id))
            lampEditPageModel = lampService.loadLamp(id);
        if(null != lampEditPageModel)
            request.setAttribute("lampEditPageModel",lampEditPageModel);

        return "admin/lamp/edit-lamp";
    }

    /**
     *
     * @param lampEditPageModel 编辑页面model
     * @param response 响应页面请求
     */
    @RequestMapping(value = "/save-lamp", method = RequestMethod.POST)
    @ResponseBody
    public CallResult<String> saveLamp(LampEditPageModel lampEditPageModel, HttpServletResponse response, HttpServletRequest request){
        CallResult<String> result = new CallResult<>();
        if(1 == lampService.saveLamp(lampEditPageModel,response)){
            result.setCode("succeed");
            result.setData("保存成功");
        }else {
            result.setCode("error");
            result.setData("保存失败");
        }

        return result;

    }


//    /**
//     * 根据id删除灯饰
//     * @param id
//     */
//    @RequestMapping("delete-lamp")
//    public void deleteLamp(Integer id){
//
//    }
//
//    /**
//     * 对富文本编辑器中的图片文件执行保存操作
//     * @param multipartFile
//     * @param response
//     */
//    @RequestMapping("/save-file")
//    @ResponseBody
//    public void saveFiles(@RequestParam("file")MultipartFile multipartFile, HttpServletResponse response){
//        fileStorageService.uploads(multipartFile,response,false);
//    }


}
