package com.zpself.module.basic.日期;

import java.util.Calendar;

/**
 * @author zengpeng
 * @date 2019/9/1
 */
public class TestDate {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, -1);

        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        c.set(Calendar.MILLISECOND, 0);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        System.out.println(month);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }

}
