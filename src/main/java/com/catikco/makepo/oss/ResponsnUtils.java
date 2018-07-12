package com.catikco.makepo.oss;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/5/2018  11:25
 * Description：
 */
public class ResponsnUtils {

    /**
     * 直接从response输出内容（通常用作ajax返回）
     */
    public static boolean print(HttpServletResponse response, String msg) {
        try {
            response.reset();
            response.setHeader("Content-Type", "text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print(msg);
            out.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
