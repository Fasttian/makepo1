package com.catikco.makepo.admin.banner.service.impl;

import com.catikco.makepo.admin.banner.model.BannerEditPageModel;
import com.catikco.makepo.admin.banner.model.BannerListPageModel;
import com.catikco.makepo.admin.banner.model.BannerRequestModel;
import com.catikco.makepo.admin.banner.service.BannerService;
import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.entity.Banner;
import com.catikco.makepo.entity.BannerExample;
import com.catikco.makepo.mapper.BannerMapper;
import com.catikco.makepo.oss.service.FileStorageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.catikco.makepo.common.DateUtils.dateToString;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-17 10:36
 * Description：
 */
@Service(value = "admin.bannerService")
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    @Autowired
    private FileStorageService fileStorageService;

    @Override
    public DatatablesResponsePageModel getList(BannerRequestModel bannerRequestModel) {
        BannerExample bannerExample = new BannerExample();
        BannerExample.Criteria criteria = bannerExample.createCriteria();

        DatatablesResponsePageModel datatablesResponsePageModel = new DatatablesResponsePageModel();

        Integer length = bannerRequestModel.getLength();      //请求条数
        Integer start=bannerRequestModel.getStart();          //起始记录
        Integer currentPage = start/length+1;                   //当前页
        String sortName = bannerRequestModel.getOrderColumn();
        String orderBy = bannerRequestModel.getOrderDir();
        String title = bannerRequestModel.getTitle();

        //排序
        if(sortName != null && !sortName.isEmpty())
            bannerExample.setOrderByClause(sortName + " " + orderBy);

        //过滤标记为删除的
        criteria.andDeletedEqualTo(false);

        if(!"".equals(title)) {
            title = "%" + title + "%";
            criteria.andTitleLike(title);
        }

        //设置起始页与查询条数
        PageHelper.offsetPage(currentPage,length);
        List<Banner> bannerList = bannerMapper.selectByExample(bannerExample);
        PageInfo<Banner> pageInfo = new PageInfo<>(bannerList);

        datatablesResponsePageModel.setRecordsTotal((int)pageInfo.getTotal());
        datatablesResponsePageModel.setRecordsFiltered((int)pageInfo.getTotal());
        datatablesResponsePageModel.setDraw(bannerRequestModel.getDraw());
        datatablesResponsePageModel.setData(this.changeToBannerListPageModel(bannerList));

        return datatablesResponsePageModel;

    }

    @Override
    public int save(BannerEditPageModel bannerEditPageModel, HttpServletResponse response) {
        String bannerImage = null;
        if(bannerEditPageModel.getMultipartFile().getOriginalFilename() != null)
            bannerImage = fileStorageService.uploads(bannerEditPageModel.getMultipartFile(),response,true,null);

        Banner banner = this.changeToBanner(bannerEditPageModel,bannerImage);

        if(bannerEditPageModel.getId() != null){
            banner.setUpdateTime(new Date());
            return bannerMapper.updateByPrimaryKey(banner);
        }else {
            banner.setCreateTime(new Date());
            banner.setDeleted(false);
            return bannerMapper.insert(banner);
        }

    }

    @Override
    public int delete(Integer id) {
        if(null == id)
            return 0;
        Banner banner = bannerMapper.selectByPrimaryKey(id);

        if(banner == null)
            return 0;

        banner.setDeleted(true);
        return bannerMapper.updateByPrimaryKey(banner);

    }

    @Override
    public BannerEditPageModel load(Integer id) {
        if(null == id)
            return null;

        Banner banner = bannerMapper.selectByPrimaryKey(id);

        if(banner == null)
            return null;

        return this.changeToBannerEditPageModel(banner);

    }

    /***************************** 私有方法 **********************************/
    private List<BannerListPageModel> changeToBannerListPageModel(List<Banner> bannerList){
        List<BannerListPageModel> bannerListPageModelList= null;
        if(!(bannerList.size() > 0))
            return null;

        bannerListPageModelList = new ArrayList<>();

        for(Banner banner:bannerList){
            BannerListPageModel bannerListPageModel = new BannerListPageModel();
            bannerListPageModel.setBannerCreateTime(dateToString(banner.getBannerCreateTime()));
            bannerListPageModel.setTitle(banner.getTitle());
            bannerListPageModel.setDescription(banner.getDescription());
            bannerListPageModel.setId(banner.getId());
            bannerListPageModelList.add(bannerListPageModel);
        }
        return bannerListPageModelList;

    }

    private Banner changeToBanner(BannerEditPageModel bannerEditPageModel,String bannerImage){
        if(bannerEditPageModel == null)
            return null;

        Banner banner = null;

        if(null != bannerEditPageModel.getId())
            banner = bannerMapper.selectByPrimaryKey(bannerEditPageModel.getId());
        else
            banner = new Banner();

        if(null != bannerImage)
            banner.setBannerImage(bannerImage);

        banner.setTitle(bannerEditPageModel.getTitle());
        banner.setDescription(bannerEditPageModel.getDescription());
        banner.setBannerCreateTime(bannerEditPageModel.getBannerCreateTime());

        return banner;
    }

    private BannerEditPageModel changeToBannerEditPageModel(Banner banner){
        if(banner == null)
            return null;

        BannerEditPageModel bannerEditPageModel = new BannerEditPageModel();
        bannerEditPageModel.setId(banner.getId());
        bannerEditPageModel.setDescription(banner.getDescription());
        bannerEditPageModel.setTitle(banner.getTitle());
        bannerEditPageModel.setBannerCreateTime(banner.getBannerCreateTime());

        return bannerEditPageModel;
    }
}
