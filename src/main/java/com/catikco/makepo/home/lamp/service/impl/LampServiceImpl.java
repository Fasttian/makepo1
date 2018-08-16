package com.catikco.makepo.home.lamp.service.impl;

import com.catikco.makepo.entity.LampExample;
import com.catikco.makepo.entity.LampWithBLOBs;
import com.catikco.makepo.home.lamp.model.LampListPageModel;
import com.catikco.makepo.home.lamp.service.LampService;
import com.catikco.makepo.mapper.LampMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/8/11  下午5:29
 * Description：
 */
@Service(value = "home.lampservice")
public class LampServiceImpl implements LampService {

    @Autowired
    private LampMapper lampMapper;

    @Override
    public LampListPageModel getLampList(Map<String, Object> queryCriteria) {
        LampExample lampExample = new LampExample();
        LampExample.Criteria criteria = lampExample.createCriteria();

        //产品按时间排序
        lampExample.setOrderByClause("productCreateTime" + " " + "asc");

        //产品类型查询
        Integer productType = null;
        Integer pageNum = null;

        //仅查询未删除的
        criteria.andDeletedEqualTo(false);

        if (null != queryCriteria){
            productType = (Integer) queryCriteria.get("productType");
            pageNum = (Integer) queryCriteria.get("pageNum");
        }

        Integer stratPage = 0;

        //查询条件
        if (null != productType){
            if((int)productType != 0)
                criteria.andProductTypeEqualTo(productType.byteValue());
        }

        if (null != pageNum) stratPage = pageNum;

        //设置分页信息
        PageHelper.startPage(stratPage, 8);

        List<LampWithBLOBs> lampWithBLOBsList = lampMapper.selectByExampleWithBLOBs(lampExample);
        //让 pageInfo对象进行分页处理
        PageInfo<LampWithBLOBs> pageInfo = new PageInfo<>(lampWithBLOBsList);

        LampListPageModel lampListPageModel = new LampListPageModel();

        lampListPageModel.setCount(pageInfo.getPages());
        lampListPageModel.setCurrentPage(pageInfo.getPageNum());
        lampListPageModel.setLampList(pageInfo.getList());
        lampListPageModel.setNextPage(pageInfo.getNextPage());
        lampListPageModel.setPrevPage(pageInfo.getPrePage());
        lampListPageModel.setNextShow(pageInfo.isHasNextPage());
        lampListPageModel.setPrevShow(pageInfo.isHasPreviousPage());
        lampListPageModel.setTotal(pageInfo.getTotal());

        return lampListPageModel;
    }

    @Override
    public LampWithBLOBs getById(Integer id) {
        if(null == id)
             return null;

        return lampMapper.selectByPrimaryKey(id);
    }
}
