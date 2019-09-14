package com.zpself.module.basic.集合.map;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Code {
    public static void main(String[] args) {
        HashMap<String ,String> hashMap = new HashMap<>(1<<2,2);
        //System.out.println(tableSizeFor(17));
        //System.out.println(Integer.toBinaryString(1<<15>>>16));
        //00000000000000000000000000000000
        //00000000000000000000000010101001
        //hashCode()算法分析
        String h= "麻子";
        int  numb ;
        System.out.println(Integer.toBinaryString(h.hashCode()));
        System.out.println(Integer.toBinaryString(h.hashCode()>>> 16));
        numb =  (numb= h.hashCode()) ^(numb >>> 16);
        System.out.println(Integer.toBinaryString(numb));

        hashMap.put("sda","1");
        hashMap.put("swe","2");
        hashMap.put("1123","2");
        hashMap.put("s231we","2");
        hashMap.put("dsd","2");
        hashMap.put("fdfd","2");
        hashMap.put("3423e","2");
        hashMap.put("gwfg","2");
        hashMap.put("rer","2");
        hashMap.put("r","2");
        hashMap.get("r");
        Set<String> strings = hashMap.keySet();
        strings.iterator();
    }


    /**
     * 扩容门槛为传入的初始容量往上取最近的2的n次方
     * @param cap  初始容量
     * @return 2的n次方  n为正整数
     */
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 1;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 2;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 4;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 8;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }
}
