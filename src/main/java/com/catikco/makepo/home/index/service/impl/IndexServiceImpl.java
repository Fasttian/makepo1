package com.catikco.makepo.home.index.service.impl;

import com.catikco.makepo.entity.LampExample;
import com.catikco.makepo.entity.LampWithBLOBs;
import com.catikco.makepo.entity.NewsExample;
import com.catikco.makepo.entity.NewsWithBLOBs;
import com.catikco.makepo.home.index.service.IndexService;
import com.catikco.makepo.mapper.LampMapper;
import com.catikco.makepo.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    @Override
    public List<LampWithBLOBs> findLamps() {
        LampExample lampExample = new LampExample();
        LampExample.Criteria criteria = lampExample.createCriteria();
        //按时间排序
        lampExample.setOrderByClause("createTime" + " " + "asc");

        //限制记录条数
        //criteria.andIdLessThanOrEqualTo(100);

        return lampMapper.selectByExampleWithBLOBs(lampExample);
    }

    @Override
    public List<LampWithBLOBs> findLampsByType(Integer productType) {
        LampExample lampExample = new LampExample();
        LampExample.Criteria criteria = lampExample.createCriteria();
        //按时间排序
        lampExample.setOrderByClause("createTime" + " " + "asc");

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
        newsExample.setOrderByClause("createTime" + " " + "asc");
        //限制记录条数
        //criteria.andIdLessThanOrEqualTo(10);

        return newsMapper.selectByExampleWithBLOBs(newsExample);
    }
}
