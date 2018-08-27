package com.catikco.makepo.admin.user.controller;

import com.catikco.makepo.admin.user.model.UserPageModel;
import com.catikco.makepo.admin.user.service.UserService;
import com.catikco.makepo.entity.User;
import com.catikco.makepo.model.CallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public User userInfo(HttpServletRequest request,Integer id){
        User user = userService.getUser(id);
        return user;
    }

    @RequestMapping("/saveUser")
    @ResponseBody
    public CallResult<String> save(UserPageModel userPageModel, HttpSession session){
        CallResult<String> result = new CallResult<>();
        if(1 == userService.save(userPageModel)){
            session.removeAttribute("password");
            session.removeAttribute("account");
            result.setCode("succeed");
            result.setData("修改成功,请重新登录！");
        }else {
            result.setCode("error");
            result.setData("修改失败！");
        }
        return result;
    }

    @RequestMapping(value = "/chkPwd",method = RequestMethod.POST)
    @ResponseBody
    public CallResult<String> chkPwd(String oldPwd,Integer id){
        CallResult<String> result = new CallResult<>();
        if(1 == userService.chkPwd(oldPwd,id)){
            result.setCode("succeed");
            result.setData("旧密码校验证成功！");
        }else {
            result.setCode("error");
            result.setData("旧密码校验证失败！");
        }
        return result;

    }


}
