package com.catikco.makepo.admin.login.service;

import com.catikco.makepo.entity.User;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-15 09:53
 * Description：
 */
public interface LoginService {
    /**
     * 根据用户名和密码验证
     * @param user
     * @return
     */
    public boolean verifyLogin(User user);

    /**
     * 根据用户名查询用户信息
     * @param account
     * @return
     */
    public User findUserByAccount(String account,String password);

}
