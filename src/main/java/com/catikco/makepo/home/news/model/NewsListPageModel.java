package com.catikco.makepo.home.news.model;

import com.catikco.makepo.entity.NewsWithBLOBs;

import java.util.List;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-04 18:13
 * Description：主页新闻列表
 */
public class NewsListPageModel {

    private boolean prevShow;                       //prev是否展示
    private Integer prevPage;                       //prev跳转到page数
    private boolean nextShow;                       //next是否展示
    private Integer nextPage;                       //next跳转到page数
    private List<NewsWithBLOBs> newsList;           //新闻列表
    private Integer count;                          //总页数
    private Integer currentPage;                    //当前页

    public boolean isPrevShow() {
        return prevShow;
    }

    public void setPrevShow(boolean prevShow) {
        this.prevShow = prevShow;
    }

    public Integer getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(Integer prevPage) {
        this.prevPage = prevPage;
    }

    public boolean isNextShow() {
        return nextShow;
    }

    public void setNextShow(boolean nextShow) {
        this.nextShow = nextShow;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public List<NewsWithBLOBs> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<NewsWithBLOBs> newsList) {
        this.newsList = newsList;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
