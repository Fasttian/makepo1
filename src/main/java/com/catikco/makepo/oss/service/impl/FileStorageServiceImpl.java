package com.catikco.makepo.oss.service.impl;

import com.catikco.makepo.entity.Filestorage;
import com.catikco.makepo.mapper.FilestorageMapper;
import com.catikco.makepo.oss.FileUtils;
import com.catikco.makepo.oss.ResponsnUtils;
import com.catikco.makepo.oss.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/5/2018  10:55
 * Description：
 */
@Service
public class FileStorageServiceImpl implements FileStorageService {
    @Value("${web.upload-path}")
    private String uploadPath;

    @Autowired
    private FilestorageMapper filestorageMapper;

    /**
     * 保存一次返回一个文件id
     * @param multipartFile 文件
     * @param isRichTextImgage 标记是否为富文本上传图片，如果是，则把富文本中的多个文件id拼为一个字符串，用于存入产品/新闻的ContentImagesFileid
     * @param response
     * @return
     */
    @Override
    public Map<String,Object> uploads(MultipartFile multipartFile, Boolean isRichTextImgage, HttpServletResponse response) {

        StringBuffer result = new StringBuffer("");
        Map<String,Object> fileIdAndIsRichTextImgage = new HashMap<>();

        if (null != multipartFile) {
            String tempFileName = null; //完整文件名
            String filePrefix = null;   //文件前缀
            String fileSuffix = null;   //文件后缀
            String filePath = null;     //保存路径：完整文件名+时间戳

            // 保存文件
            File file = null;
            FileUtils fu = new FileUtils();

                tempFileName = multipartFile.getOriginalFilename();
                //截取文件前缀并拼接时间戳
                filePrefix = tempFileName.substring(0,tempFileName.lastIndexOf(".")) + System.currentTimeMillis();

                if (null!=(filePrefix)) {
                    fileSuffix = FileUtils.getExt(tempFileName);
                    filePath = filePrefix+"."+fileSuffix;
                    FileOutputStream fo;

                    file = new File(uploadPath + filePath);
                    fu.createFile(file);

                    try {
                        fo = new FileOutputStream(file);
                        fo.write(multipartFile.getBytes());
                        fo.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //存文件表
                    Filestorage filestorage = new Filestorage();
                    filestorage.setFilepath(filePath);
                    filestorage.setFilesuffix(fileSuffix);
                    filestorage.setFileprefix(filePrefix);
                    filestorage.setFilesize(multipartFile.getSize());
                    filestorage.setDeleted(false);
                    filestorage.setCretetime(new Date());
                    filestorage.setFilestatus((byte)1);       //文件状态：1，临时 2，正常 3，废弃
                    filestorage.setRemark("临时文件");

                    filestorageMapper.insert(filestorage);      //插数据库

                    result.append("{ \"url\":\"" +filestorage.getFilepath() + "\"},");
                    //把文件id存入页面，然后再返回后台存入数据库（ContentImagesFileid）
                    result.append("{ \"fileId\":\"" +filestorage.getId() + "\"},");

                }

            result.insert(0, "{\"result\":\"success\",\"list\":[").deleteCharAt(result.length() - 1).append("]}");
            System.out.println("json = " + result.toString());
            ResponsnUtils.print(response, result.toString());
            return fileIdAndIsRichTextImgage;

        } else {
            ResponsnUtils.print(response, "J_NOT_FIND_FILE");
        }
        return null;
    }
}
