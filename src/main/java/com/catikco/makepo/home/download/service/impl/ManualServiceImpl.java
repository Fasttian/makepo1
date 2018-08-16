package com.catikco.makepo.home.download.service.impl;

import com.catikco.makepo.entity.FileStorage;
import com.catikco.makepo.entity.FileStorageExample;
import com.catikco.makepo.entity.LampExample;
import com.catikco.makepo.entity.LampWithBLOBs;
import com.catikco.makepo.home.download.model.ManualListPageModel;
import com.catikco.makepo.home.download.service.ManualService;
import com.catikco.makepo.home.lamp.model.LampListPageModel;
import com.catikco.makepo.mapper.FileStorageMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-13 00:21
 * Description：
 */
@Service(value = "home.manualService")
public class ManualServiceImpl implements ManualService {

    @Autowired
    private FileStorageMapper fileStorageMapper;

    @Override
    public ManualListPageModel getList(Map<String,Object> queryCriteria) {
        FileStorageExample fileStorageExample = new FileStorageExample();
        FileStorageExample.Criteria criteria = fileStorageExample.createCriteria();

        //产品按时间排序
        fileStorageExample.setOrderByClause("createTime" + " " + "asc");

        Integer pageNum = null;

        if (null != queryCriteria){
            pageNum = (Integer) queryCriteria.get("pageNum");
        }

        //仅查询未删除的
        criteria.andDeletedEqualTo(false);

        Integer stratPage = 0;

        if (null != pageNum) stratPage = pageNum;

        //设置只查询文件类型为2的
        criteria.andFileTypeEqualTo((byte)2);

        //设置分页信息
        PageHelper.startPage(stratPage, 10);

        List<FileStorage> fileStorageList = fileStorageMapper.selectByExample(fileStorageExample);
        //让 pageInfo对象进行分页处理
        PageInfo<FileStorage> pageInfo = new PageInfo<>(fileStorageList);

        ManualListPageModel manualListPageModel = new ManualListPageModel();

        manualListPageModel.setCount(pageInfo.getPages());
        manualListPageModel.setCurrentPage(pageInfo.getPageNum());
        manualListPageModel.setManualList(pageInfo.getList());
        manualListPageModel.setNextPage(pageInfo.getNextPage());
        manualListPageModel.setPrevPage(pageInfo.getPrePage());
        manualListPageModel.setNextShow(pageInfo.isHasNextPage());
        manualListPageModel.setPrevShow(pageInfo.isHasPreviousPage());

        return manualListPageModel;
    }
}
