package com.catikco.makepo.common;

import sun.text.resources.FormatData;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/14/2018  11:04
 * Description：日期格式处理
 */
public class DateUtils {

    /**
     *  把时间转为字符形式
     * @param date
     * @return
     */
    public static String dateToString(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

}
