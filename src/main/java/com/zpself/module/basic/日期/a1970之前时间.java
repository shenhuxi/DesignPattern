package com.zpself.module.basic.日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zengpeng
 * @date 2019/9/8
 */
public class a1970之前时间 {
    public static void main(String[] args) throws ParseException {
        String s = new String("1960-01-01");
        SimpleDateFormat ad = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = ad.parse(s);
        System.out.println(parse.getTime());
        System.out.println(ad.format(parse));
    }
}
