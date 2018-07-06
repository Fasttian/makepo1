package com.catikco.makepo.oss.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/5/2018  10:54
 * Description：
 */

public interface FileStorageService {


    /**
     * 保存一次返回一个文件id
     * @param multipartFile 文件
     * @param response
     * @return
     */
    public Integer uploads(MultipartFile multipartFile,HttpServletResponse response);

}
