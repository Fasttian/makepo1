package com.catikco.makepo.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By: Cai Rong fei @Gui Yang
 * Time: 7/5/2018  16:12
 * Description：字符串处理
 */
public class StringUtils {


    /**
     * 拆解出数据库字符串中存的文件id
     * @param fileIds
     * @return
     */
    public static List<Integer> cutContentFileId(String fileIds){

        List<Integer> fileIdList = new ArrayList<>();
        String[] fids = null;
        fids = fileIds.split("\\,");

        for(String s:fids ){
            Integer fid = Integer.valueOf(s);
            fileIdList.add(fid);
        }

        return fileIdList;
    }

    /**
     * 取出富文本中的文件id,并拼成:25,21,68,98形式的字符串
     * @param htmlContent 富文本html代码
     * @return
     */
    public static String parseContentFileId(String htmlContent){
        String newStr = "";
        List<Integer> fileIds = null;

        //解析出html中的文件id
        StringBuffer stringBuffer = new StringBuffer("");
        if(!htmlContent.isEmpty()){
            String[] fidStr = htmlContent.split("data-filename=\"");
            String fid=null;
            int index = 1;  //用index来过滤掉字符串数组的第一个元素，因为第一个是不包含文件id的
            for(String s:fidStr){
                if(index == 1){
                    fid=null;
                    index--;
                }else {
                    fid = s;
                }
                //第一个字符串数组元素不包含文件id,所以要排除，从第二个数组元素开始都是包含文件id的，所以再次截取就可以得到文件id
                if(null != fid)
                newStr = fid.substring(0,fid.indexOf("\""));

                if(!newStr.equals(""))
                stringBuffer.append(newStr+",");
            }
        }

        //去掉最后一个逗号
        newStr = stringBuffer.substring(0,stringBuffer.length()-1);
        System.out.println(newStr);

        return newStr;
    }


}
