package com.catikco.makepo.admin.login.service.impl;

import com.catikco.makepo.admin.login.service.LoginService;
import com.catikco.makepo.entity.User;
import com.catikco.makepo.entity.UserExample;
import com.catikco.makepo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-15 10:11
 * Description：
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean verifyLogin(User user) {
        if(!"".equals(user.getAccount()) && !"".equals(user.getPassword())){
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();

            //设置查询条件
            criteria.andAccountEqualTo(user.getAccount());
            criteria.andPasswordEqualTo(user.getPassword());

            List<User> userList = userMapper.selectByExample(userExample);

            return userList.size() > 0;

        }

        return false;
    }
}
