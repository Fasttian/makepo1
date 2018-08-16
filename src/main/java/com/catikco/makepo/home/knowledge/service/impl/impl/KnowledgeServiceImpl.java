package com.catikco.makepo.home.knowledge.service.impl.impl;

import com.catikco.makepo.entity.CyclopediaExample;
import com.catikco.makepo.entity.CyclopediaWithBLOBs;
import com.catikco.makepo.home.knowledge.model.KnowledgeListPageModel;
import com.catikco.makepo.home.knowledge.service.impl.KnowledgeService;
import com.catikco.makepo.mapper.CyclopediaMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/8/13  下午5:02
 * Description：
 */

@Service(value = "home.knowledgeService")
public class KnowledgeServiceImpl implements KnowledgeService {

    @Autowired
    private CyclopediaMapper cyclopediaMapper;

    @Override
    public KnowledgeListPageModel getKnowledgeList(Map<String,Object> queryCriteria) {

        CyclopediaExample cyclopediaExample = new CyclopediaExample();
        CyclopediaExample.Criteria criteria = cyclopediaExample.createCriteria();

        //按时间排序
        cyclopediaExample.setOrderByClause("cyclopediaCreateTime"+" "+"asc" );

        //仅查询未删除的
        criteria.andDeletedEqualTo(false);

        //按分页信息查询
        Integer pageNum = null;

        if(null != queryCriteria){
            pageNum = (Integer) queryCriteria.get("pageNum");
        }

        Integer startPage = 0;

        //查询条件
        if (null != pageNum) startPage = pageNum;

        //设置分页
        PageHelper.startPage(startPage,6);

        List<CyclopediaWithBLOBs> cyclopediaWithBLOBsList = cyclopediaMapper.selectByExampleWithBLOBs(cyclopediaExample);

        //用PageInfo 处理分页
        PageInfo<CyclopediaWithBLOBs> pageInfo = new PageInfo<>(cyclopediaWithBLOBsList);

        KnowledgeListPageModel knowledgeListPageModel = new KnowledgeListPageModel();

        knowledgeListPageModel.setCount(pageInfo.getPages());
        knowledgeListPageModel.setCurrentPage(pageInfo.getPageNum());
        knowledgeListPageModel.setKnowledgeList(pageInfo.getList());
        knowledgeListPageModel.setNextPage(pageInfo.getNextPage());
        knowledgeListPageModel.setPrevPage(pageInfo.getPrePage());
        knowledgeListPageModel.setNextShow(pageInfo.isHasNextPage());
        knowledgeListPageModel.setPrevShow(pageInfo.isHasPreviousPage());

        return  knowledgeListPageModel;
    }

    @Override
    public CyclopediaWithBLOBs getById(Integer id){
        if(null == id) return null;

        return cyclopediaMapper.selectByPrimaryKey(id);
    }

}
