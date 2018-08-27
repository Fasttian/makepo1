package com.catikco.makepo.admin.login.controller;

import com.catikco.makepo.admin.login.service.LoginService;
import com.catikco.makepo.entity.User;
import com.catikco.makepo.security.WebSecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-15 09:51
 * Description：
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 后台管理初始页
     * @return
     */
    @GetMapping("admin-init")
    public String adminInit(){
        return "admin/lamp/lamp-list";
    }

    @GetMapping("/login")
    public String login(){
        return "/admin/login/login";
    }

    @GetMapping("/error")
    public String error(){
        return "/admin/error/error";
    }

    @PostMapping("/loginVerify")
    public String loginVerify(HttpServletRequest request,String account, String password, HttpSession session){
        User user = new User();
        user.setAccount(account);
        user.setPassword(password);

        boolean verify = loginService.verifyLogin(user);
        if (verify) {
            session.setAttribute(WebSecurityConfig.SESSION_KEY, account);
            session.setAttribute("password", user.getPassword());
            request.setAttribute("result","登录成功！");
            request.setAttribute("user",loginService.findUserByAccount(account,password));
            return "admin/lamp/lamp-list";
        } else {
            request.setAttribute("result","登录失败！");
            return "redirect:/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        session.removeAttribute("password");
        return "redirect:/login";
    }

    @RequestMapping("/getUserInfo")
    public void getUserInfo(String account,HttpServletRequest request){
        request.setAttribute("user",loginService.findUserByAccount(account,null));
    }

}
