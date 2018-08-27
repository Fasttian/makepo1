package com.catikco.makepo.admin.user.service;

import com.catikco.makepo.admin.user.model.UserPageModel;
import com.catikco.makepo.entity.User;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-27 16:38
 * Description：
 */
public interface UserService {

    public int save(UserPageModel userPageModel);

    public User getUser(Integer id);

    public int chkPwd(String oldPwd,Integer id);

}
