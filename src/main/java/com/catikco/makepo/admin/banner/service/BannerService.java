package com.catikco.makepo.admin.banner.service;

import com.catikco.makepo.admin.banner.model.BannerEditPageModel;
import com.catikco.makepo.admin.banner.model.BannerListPageModel;
import com.catikco.makepo.admin.banner.model.BannerRequestModel;
import com.catikco.makepo.admin.common.DatatablesRequestPageModel;
import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.entity.Banner;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-17 10:29
 * Description：
 */
public interface BannerService {

    /**
     *  获取列表
     * @param bannerRequestModel
     * @return
     */
    public DatatablesResponsePageModel getList(BannerRequestModel bannerRequestModel);

    /**
     * 保存
     * @param bannerEditPageModel
     * @return
     */
    public int save(BannerEditPageModel bannerEditPageModel, HttpServletResponse response);

    /**
     * 删除
     * @param id
     * @return
     */
    public int delete(Integer id);

    /**
     * 加载编辑
     * @param id
     */
    public BannerEditPageModel load(Integer id);

}
