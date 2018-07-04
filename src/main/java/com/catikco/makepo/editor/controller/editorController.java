package com.catikco.makepo.editor.controller;

import com.catikco.makepo.editor.Sys;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/7/1  下午8:08
 * Description：summernote data test
 */
@Controller
@RequestMapping
public class editorController {
    @Value("${web.upload-path}")
    private String uploadPath;

    @RequestMapping("summernote")
    public String visitSummernote(){
        return "admin/form-summernote";
    }

    /**n
     * 上传多个文件
     *
     * @param request
     * @param response
     */
    @Transactional
    @RequestMapping("/editTor/saveFile")
    public void uploads(@RequestParam("file") MultipartFile[] files, HttpServletRequest request, HttpServletResponse response) {

                System.out.print(11111);

        // 模块 + hashcode（规则由模块而定）+ model编号组成的路径
        String path = request.getParameter("path");

        // 指定文件保存名称，仅需指定后缀名“.”之前的部分
        String name = request.getParameter("name");

        if (null != files && files.length > 0) {

            String ext = null;
            String uuid = null;
            UUID u = null;
            String tempName = null;
            String savePath = null;
            String saveName = null;

            Date now = new Date();

            // 保存文件
            File file = null;
            FileUtils fu = new FileUtils();

            // 文件的保存的名称
            String sn = null;
            StringBuffer result = new StringBuffer("");

            for (MultipartFile mf : files) {
                tempName = mf.getOriginalFilename();
                if (null!=(tempName)) {
                    ext = FileUtils.getExt(tempName);
                    if (null!=(name)) {
                        saveName = name + ext;
                    } else {
                        saveName = tempName.substring(0, tempName.lastIndexOf(Sys.DOT));
                    }

                    u = UUID.randomUUID();
                    uuid = u.toString().replace(Sys.MINUS, Sys.NONE);
                    sn = uuid + Sys.DOT + ext;

                    savePath = Sys.UPLOAD + Sys.BACKSLASH + sn;
                    System.out.println("savePath = " + savePath);
                    FileOutputStream fo;
                    int size = 0;

                    file = new File(uploadPath + savePath);
                    fu.createFile(file);

                    try {
                        fo = new FileOutputStream(file);
                        size = mf.getBytes().length;
                        fo.write(mf.getBytes());
                        fo.close();
                    } catch (Exception e) {
                       // print(response, Msg.ERROR);
                        e.printStackTrace();
                    }

//                    String httpUrl = request.getScheme()+"://"+ request.getServerName() + ":" + request.getServerPort() + "/" +savePath;

                    result.append("{\"sn\":\"" + sn + "\", \"name\":\"" + tempName + "\",\"url\":\"" + savePath + "\"},");
                }
            }

            result.insert(0, "{\"result\":\"success\",\"list\":[").deleteCharAt(result.length() - 1).append("]}");
            System.out.println("json = " + result.toString());
            print(response, result.toString());

        } else {
            print(response,"J_NOT_FIND_FILE");
            System.out.print("failure!!!");
        }
    };

    /**
     * 直接从response输出内容（通常用作ajax返回）
     */
    protected boolean print(HttpServletResponse response, String msg) {
        try {
            response.setHeader("Content-Type", "text/html; charset=UTF-8");
            response.getWriter().print(msg);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}





