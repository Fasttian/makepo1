package com.catikco.makepo.home.lamp.model;

import com.catikco.makepo.entity.LampWithBLOBs;

import java.util.List;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/8/11  下午4:43
 * Description：
 */

public class LampListPageModel {
    private boolean prevShow;                       //prev是否展示
    private Integer prevPage;                       //prev跳转到page数
    private boolean nextShow;                       //next是否展示
    private Integer nextPage;                       //next跳转到page数
    private List<LampWithBLOBs> lampList;           //灯饰列表
    private Integer count;                          //总页数
    private Integer currentPage;                    //当前页
    private Long total;                          //总条数

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

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

    public List<LampWithBLOBs> getLampList() {
        return lampList;
    }

    public void setLampList(List<LampWithBLOBs> lampList) {
        this.lampList = lampList;
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
