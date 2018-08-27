package com.catikco.makepo.admin.user.controller;

import com.catikco.makepo.admin.user.service.UserService;
import com.catikco.makepo.entity.User;
import com.catikco.makepo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-27 16:38
 * Description：
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userInfo")
    @ResponseBody
    public User userInfo(HttpServletRequest request,String account){
        User user = userService.getUser(account);
        return user;
    }


}
