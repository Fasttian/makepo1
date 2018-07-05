package com.catikco.makepo.oss.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/5/2018  10:54
 * Description：
 */

public interface FileStorageService {

    public void uploads(MultipartFile[] files,HttpServletResponse response);

}
