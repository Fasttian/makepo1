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
     * @param isRichTextImgage 标记是否为富文本上传图片，如果是，则把富文本中的多个文件id拼为一个字符串，用于存入产品/新闻的ContentImagesFileid
     * @param response
     * @return
     */
    public Map<String,Object> uploads(MultipartFile multipartFile, Boolean isRichTextImgage, HttpServletResponse response);

}
