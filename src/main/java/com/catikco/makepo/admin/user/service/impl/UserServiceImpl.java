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
        if(!"".equals(userPageModel.getId())){
            newUser = userMapper.selectByPrimaryKey(userPageModel.getId());
            newUser.setUpdateTime(new Date());
            newUser.setUsername(userPageModel.getUsername());
            newUser.setPassword(userPageModel.getPassword());
            if(userPageModel.getPassword().equals(""))
                return 0;
            return userMapper.updateByPrimaryKey(newUser);
        }else{
            newUser = new User();
            newUser.setCreateTime(new Date());
            newUser.setAccount(userPageModel.getAccount());
            newUser.setUsername(userPageModel.getUsername());
            if(userPageModel.getPassword().equals(""))
                return 0;
            newUser.setPassword(userPageModel.getPassword());
            return userMapper.insert(newUser);
        }

    }

    @Override
    public User getUser(Integer id) {
        if("".equals(id))
            return null;

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int chkPwd(String oldPwd,Integer id) {
        if("".equals(oldPwd)||"".equals(id))
            return 0;

        User user = userMapper.selectByPrimaryKey(id);

        if(user == null)
            return 0;

        if( !user.getPassword().equals(oldPwd))
            return 0;

        return 1;

    }
}
