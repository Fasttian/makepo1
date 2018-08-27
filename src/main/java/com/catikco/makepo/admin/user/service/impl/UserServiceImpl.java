package com.catikco.makepo.admin.user.service.impl;

import com.catikco.makepo.admin.user.model.UserPageModel;
import com.catikco.makepo.admin.user.service.UserService;
import com.catikco.makepo.entity.User;
import com.catikco.makepo.entity.UserExample;
import com.catikco.makepo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-27 16:40
 * Description：
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(UserPageModel userPageModel) {
        if(userPageModel == null)
            return 0;

        User newUser = null;
        if(userPageModel.getId() != null){
            newUser = new User();
            newUser.setUpdateTime(new Date());
            newUser.setUsername(userPageModel.getUsername());
            newUser.setPassword(userPageModel.getPassword());
            return userMapper.updateByPrimaryKey(newUser);
        }else{
            newUser = new User();
            newUser.setCreateTime(new Date());
            newUser.setAccount(userPageModel.getAccount());
            newUser.setUsername(userPageModel.getUsername());
            newUser.setPassword(userPageModel.getPassword());
            return userMapper.insert(newUser);
        }

    }

    @Override
    public User getUser(String account) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();

        if(!"".equals(account))
            criteria.andAccountEqualTo(account);

        List<User> userList = userMapper.selectByExample(userExample);

        if(userList.size() > 0)
            return userList.get(0);

        return null;
    }
}
