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

    @Override
    public void uploads(MultipartFile[] files,HttpServletResponse response) {

        StringBuffer result = new StringBuffer("");

        if (null != files && files.length > 0) {

            String tempFileName = null; //完整文件名
            String filePrefix = null;   //文件前缀
            String fileSuffix = null;   //文件后缀
            String filePath = null;     //保存路径：完整文件名+时间戳

            // 保存文件
            File file = null;
            FileUtils fu = new FileUtils();

            for (MultipartFile mf : files) {
                tempFileName = mf.getOriginalFilename();

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
                        fo.write(mf.getBytes());
                        fo.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    //存文件表
                    Filestorage filestorage = new Filestorage();
                    filestorage.setFilepath(filePath);
                    filestorage.setFilesuffix(fileSuffix);
                    filestorage.setFileprefix(filePrefix);
                    filestorage.setFilesize(mf.getSize());
                    filestorage.setDeleted(false);
                    filestorage.setCretetime(new Date());

                    String lll=uploadPath+filePath;

                    result.append("{ \"url\":\"" +filePath + "\"},");
                    filestorageMapper.insert(filestorage);      //插数据库

                }
            }
            result.insert(0, "{\"result\":\"success\",\"list\":[").deleteCharAt(result.length() - 1).append("]}");
            System.out.println("json = " + result.toString());

           ResponsnUtils.print(response, result.toString());

        } else {
            ResponsnUtils.print(response, "J_NOT_FIND_FILE");
        }
    }
}
