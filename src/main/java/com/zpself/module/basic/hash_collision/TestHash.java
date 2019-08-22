package com.zpself.module.basic.hash_collision;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zengpeng
 * @date 2019/8/21
 */
public class TestHash {
    public static void main(String[] args) {
        HashMap map = new HashMap(10);
        map.put("1","2");
        System.out.println(map);
    }
}
