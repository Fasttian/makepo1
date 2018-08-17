package com.catikco.makepo.home.index.service;

import com.catikco.makepo.entity.LampWithBLOBs;
import com.catikco.makepo.entity.NewsWithBLOBs;
import com.catikco.makepo.home.index.model.BannerListPageModel;

import java.util.List;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-14 17:02
 * Description：
 */
public interface IndexService {

    /**
     *加载新产品:灯饰与电源（暂时只查电源）
     * @return
     */
    public List<LampWithBLOBs> findLamps();

    /**
     * 灯饰产品分类查询
     * @param productType 分类
     * @return
     */
    public List<LampWithBLOBs> findLampsByType(Integer productType);

    /**
     * 新闻查询
     * @return
     */
    public List<NewsWithBLOBs> findNews();

    /**
     * banner展示
     * @return
     */
    public List<BannerListPageModel> getList();

}
