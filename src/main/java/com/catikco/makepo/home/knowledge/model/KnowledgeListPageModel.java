package com.catikco.makepo.home.knowledge.model;

import com.catikco.makepo.entity.CyclopediaWithBLOBs;

import java.util.List;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/8/13  下午4:56
 * Description：
 */

public class KnowledgeListPageModel {

    private boolean prevShow;                       //prev是否展示
    private Integer prevPage;                       //prev跳转到page数
    private boolean nextShow;                       //next是否展示
    private Integer nextPage;                       //next跳转到page数
    private List<CyclopediaWithBLOBs> knowledgeList;           //新闻列表
    private Integer count;                          //总页数

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

    public List<CyclopediaWithBLOBs> getKnowledgeList() {
        return knowledgeList;
    }

    public void setKnowledgeList(List<CyclopediaWithBLOBs> knowledgeList) {
        this.knowledgeList = knowledgeList;
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

    private Integer currentPage;                    //当前页

}
