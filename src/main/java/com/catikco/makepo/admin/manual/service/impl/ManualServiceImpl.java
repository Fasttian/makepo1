package com.catikco.makepo.admin.manual.service.impl;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.manual.model.ManualListPageModel;
import com.catikco.makepo.admin.manual.model.ManualRequestPageModel;
import com.catikco.makepo.admin.manual.service.ManualService;
import com.catikco.makepo.entity.FileStorage;
import com.catikco.makepo.entity.FileStorageExample;
import com.catikco.makepo.mapper.FileStorageMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.catikco.makepo.common.DateUtils.dateToString;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 18:16
 * Description：
 */
@Service
public class ManualServiceImpl implements ManualService {

    @Autowired
    private FileStorageMapper fileStorageMapper;

    @Override
    public DatatablesResponsePageModel<ManualListPageModel> getManualList(ManualRequestPageModel manualRequestPageModel) {

        DatatablesResponsePageModel datatablesResponsePageModel = new DatatablesResponsePageModel();     //要返回给页面的新闻列表model

        FileStorageExample fileStorageExample = new FileStorageExample();                    //example用于添加条件，相当where后面的部分
        FileStorageExample.Criteria criteria =fileStorageExample.createCriteria();          //创建封装条件的对象

        Integer length = manualRequestPageModel.getLength();      //请求条数
        Integer start=manualRequestPageModel.getStart();          //起始记录
        Integer currentPage = start/length+1;                   //当前页
        String sortName = manualRequestPageModel.getOrderColumn();   //排序字段名
        String sort = manualRequestPageModel.getOrderDir();           //排序方式 asc/desc

        String name = manualRequestPageModel.getFilePrefix();         //按手册名查询

        // 设置排序方式
        if (sortName != null && !sortName.isEmpty()) {
            fileStorageExample.setOrderByClause(sortName + " " + sort);
        }

        // 按新闻标题查询
        if (!"".equals(name)) {
            name = "%" + name + "%";
            criteria.andFilePrefixLike(name);
        }

        //查询标记为未删除的
        criteria.andDeletedEqualTo(false);

        //文件类型为2是手册文件
        criteria.andFileTypeEqualTo((byte)2);

        //设置分页信息
        PageHelper.startPage(currentPage,length);

        //根据条件从数据库查询出新闻
        List<FileStorage> fileList = fileStorageMapper.selectByExample(fileStorageExample);

        //让pageInfo对象进行分页的处理
        PageInfo<FileStorage> pageInfo = new PageInfo<>(fileList);

        datatablesResponsePageModel.setRecordsFiltered((int)pageInfo.getTotal());
        datatablesResponsePageModel.setRecordsTotal((int)pageInfo.getTotal());
        datatablesResponsePageModel.setDraw(manualRequestPageModel.getDraw());

        datatablesResponsePageModel.setData(this.changeToManualListPageModel(fileList));

        return datatablesResponsePageModel;
    }

    private List<ManualListPageModel> changeToManualListPageModel(List<FileStorage> fileList){

        List<ManualListPageModel> manualListPageModelList = new ArrayList<>();

        for(FileStorage file:fileList){
            ManualListPageModel manualListPageModel = new ManualListPageModel();
            manualListPageModel.setId(file.getId());
            manualListPageModel.setFilePrefix(file.getFilePrefix());
            manualListPageModel.setCreateTime(dateToString(file.getCreateTime()));

            manualListPageModelList.add(manualListPageModel);

        }

        return manualListPageModelList;
    }

}
