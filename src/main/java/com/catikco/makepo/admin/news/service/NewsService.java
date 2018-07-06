package com.catikco.makepo.admin.news.service;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.news.model.NewsEditPageModel;
import com.catikco.makepo.admin.news.model.NewsListPageModel;
import com.catikco.makepo.admin.news.model.NewsRequestPageModel;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/1/2018  14:18
 * Description：
 */
public interface NewsService {

    /**
     * 加载新闻列表
     * @param newsRequestPageModel
     * @return
     */
    public DatatablesResponsePageModel<NewsListPageModel> getNewsList(NewsRequestPageModel newsRequestPageModel);

    /**
     *
     * @param multipartFile 上传的文件
     * @param newsEditPageModel 编辑框页面model
     * @param response  响应页面请求
     */
    public void saveNews(MultipartFile multipartFile, NewsEditPageModel newsEditPageModel,HttpServletResponse response);
}
