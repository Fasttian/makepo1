package com.catikco.makepo.security;

import com.catikco.makepo.admin.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-15 10:50
 * Description：
 */
@Configuration
public class WebSecurityConfig  extends WebMvcConfigurerAdapter {

    public final static String SESSION_KEY="account";

    @Bean
    public SecurityInterceptor getSecurityInterceptor(){
        return new SecurityInterceptor();
    }

    public void  addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());

        //排除
        addInterceptor.excludePathPatterns("/error");
        addInterceptor.excludePathPatterns("/login");
        addInterceptor.excludePathPatterns("/logout");
//        addInterceptor.excludePathPatterns("/getUserInfo");

        //拦截(仅拦截list页面)
        addInterceptor.addPathPatterns("/cyclopedia-list");
        addInterceptor.addPathPatterns("/lamp-list");
        addInterceptor.addPathPatterns("/manual-list");
        addInterceptor.addPathPatterns("/message-list");
        addInterceptor.addPathPatterns("/news-list");
        addInterceptor.addPathPatterns("/power-list");
        addInterceptor.addPathPatterns("/news-list");
        addInterceptor.addPathPatterns("/getUserInfo");
        addInterceptor.addPathPatterns("/admin-init");
        addInterceptor.addPathPatterns("/banner-list");
    }

    private class SecurityInterceptor extends HandlerInterceptorAdapter{
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws IOException {
            HttpSession session = request.getSession();

            //判断是否已有该用户登录的session
            if(session.getAttribute(SESSION_KEY) != null){
                return true;
            }

            //跳转到登录页
            String url = "/login";
            response.sendRedirect(url);
            return false;
        }
    }
}
