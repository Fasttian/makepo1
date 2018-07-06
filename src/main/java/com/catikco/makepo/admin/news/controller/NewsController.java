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
import java.util.List;

import static com.catikco.makepo.common.StringUtils.cutContentFileId;
import static com.catikco.makepo.common.StringUtils.mergeContentFileId;


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
    public String adminInit(HttpServletResponse response){
        String  htmlContent = "<h3><img src=\"风景图片IMG_25511530805047509.JPG\" data-filename=\"24\" style=\"width: 974px;\"><img src=\"风景图片IMG_25511530804855509.JPG\" data-filename=\"22\" style=\"width: 974px;\"><img src=\"风景图片IMG_25511530804860863.JPG\" data-filename=\"23\" style=\"width: 974px;\">Hello Summernote</h3>";
        String fileIds =  mergeContentFileId(htmlContent);
        List<Integer> fidList = cutContentFileId(fileIds);
        NewsEditPageModel newsEditPageModel = new NewsEditPageModel();
        newsEditPageModel.setContent(htmlContent);
        newsEditPageModel.setTitle("新闻测试");
        newsEditPageModel.setKeywords("关键字测试");
        newsEditPageModel.setDigest("摘要测试");

        newsService.saveNews(newsEditPageModel,response);

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
    public String edit(Integer id,HttpServletResponse response){
        return "admin/news/edit-news";
    }

    /**
     *
     * @param newsEditPageModel 编辑页面model
     * @param multipartFile 文件
     * @param response 响应页面请求
     */
    @RequestMapping("save-news")
    @ResponseBody
    public void saveNews(NewsEditPageModel newsEditPageModel,@RequestParam("file")MultipartFile multipartFile, HttpServletResponse response){
        newsService.saveNews(newsEditPageModel,response);
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
     * @param multipartFile
     * @param response
     */
    @RequestMapping("/save-file")
    @ResponseBody
    public void saveFiles(@RequestParam("file")MultipartFile multipartFile, HttpServletResponse response){
       fileStorageService.uploads(multipartFile,response);
    }




}
