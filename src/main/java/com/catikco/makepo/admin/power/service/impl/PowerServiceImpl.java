package com.catikco.makepo.admin.power.service.impl;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.power.model.PowerEditPageModel;
import com.catikco.makepo.admin.power.model.PowerListPageModel;
import com.catikco.makepo.admin.power.model.PowerRequestPageModel;
import com.catikco.makepo.admin.power.service.PowerService;
import com.catikco.makepo.entity.Power;
import com.catikco.makepo.entity.PowerExample;
import com.catikco.makepo.entity.PowerWithBLOBs;
import com.catikco.makepo.mapper.PowerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/8/2018  14:28
 * Description：
 */
@Service
public class PowerServiceImpl implements PowerService {

    @Autowired
    private PowerMapper powerMapper;

    @Override
    public DatatablesResponsePageModel getPowerList(PowerRequestPageModel powerRequestPageModel) {
        //封装查询条件
        PowerExample powerExample = new PowerExample();
        PowerExample.Criteria criteria = powerExample.createCriteria();

        DatatablesResponsePageModel datatablesResponsePageModel = new DatatablesResponsePageModel();

        Integer length = powerRequestPageModel.getLength();      //请求条数
        Integer start=powerRequestPageModel.getStart();          //起始记录
        Integer currentPage = start/length+1;                   //当前页
        String sortName = powerRequestPageModel.getOrderColumn();
        String orderBy = powerRequestPageModel.getOrderDir();

        String model = powerRequestPageModel.getModel(); //按型号查询

        if(!"".equals(sortName) && !"".equals(orderBy)){
            powerExample.setOrderByClause(sortName + " " +orderBy);
        }

        if(null != model){
            model = "%" + model +"%";
            criteria.andModelLike(model);
        }

        PageHelper.offsetPage(length,currentPage);
        List<Power> powerList = powerMapper.selectByExample(powerExample);
        PageInfo<Power> powerPageInfo = new PageInfo<>(powerList);

        datatablesResponsePageModel.setDraw(powerRequestPageModel.getDraw());
        datatablesResponsePageModel.setRecordsTotal((int)powerPageInfo.getTotal());
        datatablesResponsePageModel.setRecordsFiltered((int)powerPageInfo.getTotal());
        datatablesResponsePageModel.setData(powerPageInfo.getList());

        return datatablesResponsePageModel;
    }

    @Override
    public PowerEditPageModel loadPower(Integer id) {
        if(id==null)
            return null;
        return changeToPowerEditPageModel(powerMapper.selectByPrimaryKey(id));
    }

    @Override
    public Integer deletePower(Integer id) {
        return null;
    }

    /************************** 私有方法******************************/

    /**
     * 转换数据为页面list model
     * @param power
     * @return
     */
    private PowerListPageModel changeToPowerListPageModel(Power power){
        PowerListPageModel powerListPageModel = new PowerListPageModel();
        if(null == power)
            return null;

        powerListPageModel.setId(power.getId());
        powerListPageModel.setInput(power.getInput());
        powerListPageModel.setOutput(power.getOutput());
        powerListPageModel.setSize(power.getSize());
        powerListPageModel.setModel("型号");

        return powerListPageModel;
    }

    private PowerEditPageModel changeToPowerEditPageModel(PowerWithBLOBs powerWithBLOBs){
        PowerEditPageModel powerEditPageModel = new PowerEditPageModel();
        if(null != powerWithBLOBs){
            powerEditPageModel.setDescription(powerWithBLOBs.getDescription());
            powerEditPageModel.setId(powerWithBLOBs.getId());
            powerEditPageModel.setInput(powerWithBLOBs.getInput());
            powerEditPageModel.setKeywords(powerWithBLOBs.getKeywords());
            powerEditPageModel.setOutput(powerWithBLOBs.getOutput());
            powerEditPageModel.setPower(powerWithBLOBs.getPower());
            powerEditPageModel.setTitle(powerWithBLOBs.getTitle());
            powerEditPageModel.setRemark(powerWithBLOBs.getRemark());
            powerEditPageModel.setProductUrl("/power-detail");
            powerEditPageModel.setSize(powerWithBLOBs.getSize());
        }
        return powerEditPageModel;
    }
}
