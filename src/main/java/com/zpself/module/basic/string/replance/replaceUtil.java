package com.zpself.module.basic.string.replance;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zengpeng
 * @date 2019/6/10
 */
public class replaceUtil {
    public static void main(String[] args) {
        replace();
    }

    /**
     * 1.写死的{* }的替换：如  getvalue(人大{year},财政收入{shouRu})
     * 2.获取string[] { "{year}","{shouRu}"}
     * 3.从map中得到需要替换为  “年”，"收入"
     */
    private static void replace(){
        //step1 准备参数
        String target = "getValue({year}人大{year},财政收入{income},{income123},{income678})";
        // String target = "getValue(2019,123,1000000)";

        Map<String,String> map = new HashMap<>(2);
        map.put("{year}","2019");
        map.put("{income}","100万元");
        //step2 替换
        String rgex = "\\{(.*?)}";

        Set<String> set = new HashSet<>(1);
        Pattern pattern = Pattern.compile(rgex);
        Matcher m = pattern.matcher(target);
        while (m.find()) {
            set.add(m.group());
        }
        System.out.println(set);

        for (String s : set) {
            if(map.containsKey(s)){
                target = target.replace(s, map.get(s));
            }
        }
        System.out.println("转换结果为："+target);
    }
}
