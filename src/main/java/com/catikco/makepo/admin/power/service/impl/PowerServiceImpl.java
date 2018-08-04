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
import com.catikco.makepo.oss.service.FileStorageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
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

    @Autowired
    private FileStorageService fileStorageService;

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

        if(sortName != null && !sortName.isEmpty()){
            powerExample.setOrderByClause(sortName + " " +orderBy);
        }

        if(!"".equals(model)){
            model = "%" + model +"%";
            criteria.andModelLike(model);
        }

        //查询标记为未删除的
        criteria.andDeletedEqualTo(false);

        PageHelper.offsetPage(currentPage,length);
        List<Power> powerList = powerMapper.selectByExample(powerExample);
        PageInfo<Power> powerPageInfo = new PageInfo<>(powerList);

        datatablesResponsePageModel.setRecordsTotal((int)powerPageInfo.getTotal());
        datatablesResponsePageModel.setRecordsFiltered((int)powerPageInfo.getTotal());
        datatablesResponsePageModel.setDraw(powerRequestPageModel.getDraw());
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
        PowerWithBLOBs powerWithBLOBs = null;
        if(null != id){
            powerWithBLOBs = powerMapper.selectByPrimaryKey(id);
            powerWithBLOBs.setDeleted(true);
            return powerMapper.updateByPrimaryKey(powerWithBLOBs);
        }
        return null;
    }

    /**
     * 保存
     * @param powerEditPageModel
     * @param response
     * @return
     */
    @Override
    public Integer savePower(PowerEditPageModel powerEditPageModel, HttpServletResponse response) {
        Integer productTitleImageFileid = null; //产品图片文件id
        MultipartFile multipartFile = powerEditPageModel.getTitImage();
        if(null != powerEditPageModel.getTitImage().getOriginalFilename())
            productTitleImageFileid = fileStorageService.uploads(multipartFile,response,true);

        PowerWithBLOBs powerWithBLOBs =changeToPowerWithBLOBs(powerEditPageModel,productTitleImageFileid,null);
        //插数据库
        if(powerEditPageModel.getId() != null && !"".equals(powerEditPageModel.getId())){
                return powerMapper.updateByPrimaryKey(powerWithBLOBs);
        }else {
            return powerMapper.insert(powerWithBLOBs);
        }

    }

    /************************** 私有方法******************************/


    private PowerWithBLOBs changeToPowerWithBLOBs(PowerEditPageModel powerEditPageModel,Integer productTitleImageFileid,Integer contentFileid){
        PowerWithBLOBs powerWithBLOBs = new PowerWithBLOBs();

        powerWithBLOBs.setModel(powerEditPageModel.getModel());
        powerWithBLOBs.setDescription(powerEditPageModel.getDescription());
        powerWithBLOBs.setCreteTime(new Date());
        powerWithBLOBs.setProductTitleImageFileid(productTitleImageFileid);
        powerWithBLOBs.setId(powerEditPageModel.getId());
        powerWithBLOBs.setInput(powerEditPageModel.getInput());
        powerWithBLOBs.setOutput(powerEditPageModel.getOutput());
        powerWithBLOBs.setKeywords(powerEditPageModel.getKeywords());
        powerWithBLOBs.setProductUrl("/power-detail");
        powerWithBLOBs.setProductCreateTime(powerEditPageModel.getProductCreateTime());
        powerWithBLOBs.setPower(powerEditPageModel.getPower());
        powerWithBLOBs.setSize(powerEditPageModel.getSize());
        powerWithBLOBs.setDeleted(false);
        powerWithBLOBs.setTitle(powerEditPageModel.getTitle());

        return powerWithBLOBs;
    }

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

    /**
     * 转换数据为编辑框页面model
     * @param powerWithBLOBs
     * @return
     */
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
            powerEditPageModel.setModel(powerWithBLOBs.getModel());
            powerEditPageModel.setProductUrl("/power-detail");
            powerEditPageModel.setSize(powerWithBLOBs.getSize());
            powerEditPageModel.setProductCreateTime(powerWithBLOBs.getProductCreateTime());

        }
        return powerEditPageModel;
    }
}
