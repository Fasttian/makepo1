package com.catikco.makepo.home.power.service.impl;

import com.catikco.makepo.entity.PowerExample;
import com.catikco.makepo.entity.PowerWithBLOBs;
import com.catikco.makepo.home.power.model.PowerListPageModel;
import com.catikco.makepo.home.power.service.PowerService;
import com.catikco.makepo.mapper.PowerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-12 12:12
 * Description：
 */
@Service(value = "home.pwerService")
public class PowerServiceImpl implements PowerService {

    @Autowired
    private PowerMapper powerMapper;

    @Override
    public PowerListPageModel getPowerList(Map<String, Object> queryCriteria) {
        PowerExample powerExample = new PowerExample();
        PowerExample.Criteria criteria = powerExample.createCriteria();

        //产品按时间排序
        powerExample.setOrderByClause("productCreateTime" + " " + "asc");

        //产品类型查询
        Integer productType = null;
        Integer pageNum = null;


        if (null != queryCriteria){
            //productType = (Integer) queryCriteria.get("productType");
            pageNum = (Integer) queryCriteria.get("pageNum");
        }

        Integer stratPage = 0;

        //查询条件
       /* if (null != productType && productType != 0){
            criteria.andProductTypeEqualTo(productType.byteValue());
        }*/

        if (null != pageNum) stratPage = pageNum;

        //设置分页信息
        PageHelper.startPage(stratPage, 8);

        List<PowerWithBLOBs> powerWithBLOBsList = powerMapper.selectByExampleWithBLOBs(powerExample);
        //让 pageInfo对象进行分页处理
        PageInfo<PowerWithBLOBs> pageInfo = new PageInfo<>(powerWithBLOBsList);

        PowerListPageModel powerListPageModel = new PowerListPageModel();

        powerListPageModel.setCount(pageInfo.getPages());
        powerListPageModel.setCurrentPage(pageInfo.getPageNum());
        powerListPageModel.setPowerList(pageInfo.getList());
        powerListPageModel.setNextPage(pageInfo.getNextPage());
        powerListPageModel.setPrevPage(pageInfo.getPrePage());
        powerListPageModel.setNextShow(pageInfo.isHasNextPage());
        powerListPageModel.setPrevShow(pageInfo.isHasPreviousPage());
        powerListPageModel.setTotal(pageInfo.getTotal());

        return powerListPageModel;
    }

    @Override
    public PowerWithBLOBs getById(Integer id) {
        if(null == id)
            return null;

        return powerMapper.selectByPrimaryKey(id);
    }
}
