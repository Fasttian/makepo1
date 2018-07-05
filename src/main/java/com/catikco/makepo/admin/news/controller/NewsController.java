package com.catikco.makepo.admin.news.controller;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.news.model.NewsEditPageModel;
import com.catikco.makepo.admin.news.model.NewsListPageModel;
import com.catikco.makepo.admin.news.model.NewsRequestPageModel;
import com.catikco.makepo.admin.news.service.NewsService;
import com.catikco.makepo.oss.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;


/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/1/2018  14:16
 * Description：
 */
@Controller(value = "admin.NewsController")
@RequestMapping
public class NewsController {

    @Autowired
    private NewsService newsService;

    @Autowired
    private FileStorageService fileStorageService;


    /**
     * 后台管理初始页
     * @return
     */
    @RequestMapping("admin-init")
    public String adminInit(){
        return "admin/index";
    }

    /**
     * 新闻管理页面
     * @return
     */
    @RequestMapping("news-list")
    public String newsInit(){
        return "admin/news/news-list";
    }

    /**
     * 加载新闻列表
     * @return
     */
    @RequestMapping("load-news-list")
    @ResponseBody
    public DatatablesResponsePageModel<NewsListPageModel> loadList(NewsRequestPageModel newsRequestPageModel){
        return newsService.getNewsList(newsRequestPageModel);
    }


    /**
     * 初始化新闻编辑/添加页面
     * @return
     */
    @RequestMapping("edit-news")
    public String visitSummernote(Integer id,HttpServletResponse response){
        return "admin/news/edit-news";
    }

    /**
     * 保存新闻
     * @param newsEditPageModel  新闻编辑页面model
     * @param files 新闻概要图片文件
     * @param response 请求响应
     */
    @RequestMapping("save-news")
    @ResponseBody
    public void saveNews(NewsEditPageModel newsEditPageModel,@RequestParam("file")MultipartFile[] files,  HttpServletResponse response){

        //1.保存新闻

        //2.保存图片
        fileStorageService.uploads(files,response);
    }


    /**
     * 根据id删除新闻
     * @param id
     */
    @RequestMapping("delete-news")
    public void deleteNews(Integer id){

    }

    /**
     * 对富文本编辑器中的图片文件执行保存操作
     * @param files
     * @param response
     */
    @RequestMapping("/save-editorfiles")
    @ResponseBody
    public void saveFiles(@RequestParam("file")MultipartFile[] files,  HttpServletResponse response){
      fileStorageService.uploads(files,response);
    }




}
