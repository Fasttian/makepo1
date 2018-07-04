package com.catikco.makepo.editor.controller;

import javax.servlet.http.HttpServletRequest;

public class PathUtis {

    /**
     *
     * @description 得到项目的根目录的绝对路径
     */
    public static String getabPath(HttpServletRequest request){
        String path = request.getServletContext().getRealPath("/");
        path = path.replaceAll("\\\\", "/");
        return path;
    }

    public static String getBasePath(HttpServletRequest request) {
        String contextPath = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+
                request.getServerPort()+contextPath+"/";

        return basePath;
    }
}