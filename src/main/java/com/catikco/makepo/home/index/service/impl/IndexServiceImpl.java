package com.catikco.makepo.home.index.service.impl;

import com.catikco.makepo.entity.*;
import com.catikco.makepo.home.index.model.BannerListPageModel;
import com.catikco.makepo.home.index.service.IndexService;
import com.catikco.makepo.mapper.BannerMapper;
import com.catikco.makepo.mapper.LampMapper;
import com.catikco.makepo.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-14 17:07
 * Description：
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private LampMapper lampMapper;

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private BannerMapper bannerMapper;


    @Override
    public List<LampWithBLOBs> findLamps() {
        LampExample lampExample = new LampExample();
        LampExample.Criteria criteria = lampExample.createCriteria();
        //按时间排序
        lampExample.setOrderByClause("createTime" + " " + "desc");

        //限制记录条数
        //criteria.andIdLessThanOrEqualTo(100);

        return lampMapper.selectByExampleWithBLOBs(lampExample);
    }

    @Override
    public List<LampWithBLOBs> findLampsByType(Integer productType) {
        LampExample lampExample = new LampExample();
        LampExample.Criteria criteria = lampExample.createCriteria();
        //按时间排序
        lampExample.setOrderByClause("createTime" + " " + "desc");

        //限制记录条数
        //criteria.andIdLessThanOrEqualTo(100);


        //分类查询
      /*  if(!"".equals(productType))
            criteria.andProductTypeEqualTo(productType.byteValue());*/

        return lampMapper.selectByExampleWithBLOBs(lampExample);
    }

    @Override
    public List<NewsWithBLOBs> findNews() {
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        //按时间排序
        newsExample.setOrderByClause("createTime" + " " + "desc");
        //限制记录条数
        //criteria.andIdLessThanOrEqualTo(10);

        return newsMapper.selectByExampleWithBLOBs(newsExample);
    }

    @Override
    public List<BannerListPageModel> getList() {
        BannerExample bannerExample = new BannerExample();
        BannerExample.Criteria criteria = bannerExample.createCriteria();

        //排序
        bannerExample.setOrderByClause("bannerCreateTime" + " " + "desc");

        //过滤
        criteria.andDeletedEqualTo(false);

        List<Banner> bannerList = bannerMapper.selectByExample(bannerExample);

        return this.changeToBannerListPageModel(bannerList);
    }

    /********************************** 私有方法 ******************************************************/
    private List<BannerListPageModel> changeToBannerListPageModel(List<Banner> bannerList){
        if(!(bannerList.size()>0))
            return null;

        List<BannerListPageModel> bannerListPageModelList = new ArrayList<>();
        for(Banner banner:bannerList){
            BannerListPageModel bannerListPageModel = new BannerListPageModel();
            bannerListPageModel.setBannerImage(banner.getBannerImage());
            bannerListPageModel.setDescription(banner.getDescription());
            bannerListPageModel.setTitle(banner.getTitle());
            bannerListPageModel.setId(banner.getId());
            bannerListPageModelList.add(bannerListPageModel);
        }
        return bannerListPageModelList;

    }

}
