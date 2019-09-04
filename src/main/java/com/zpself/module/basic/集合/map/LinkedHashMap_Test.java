package com.zpself.module.basic.集合.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author zengpeng
 * @date 2019/9/4
 */
public class LinkedHashMap_Test {
    public static LinkedHashMap<String, String> results = new LinkedHashMap<>();
    public static void main(String[] args) {
        results.put("1","yii");
        results.put("2","2");
        results.put("3","3");
        results.put("4","4");
        results.put("5","5");
        results.put("6","6");
        results.put("7","7");
        results.put("8","8");
        results.put("9","9");
        results.put("10","10");
        results.put("11","11");

        if(results.size()>=10){
            for (String s : results.keySet()) {
                results.remove(s);
                break;
            }
        }
        for (String s : results.keySet()) {
            System.out.println(results.get(s));
        }

    }
}
