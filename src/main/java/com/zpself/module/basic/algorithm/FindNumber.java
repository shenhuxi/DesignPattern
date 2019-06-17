package com.zpself.module.basic.algorithm;

import com.google.common.collect.Lists;

import java.util.*;

/**
 * @author zengpeng
 * @date 2019/6/14
 */
public class findNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Lists.newArrayList(0,1,3,7,9,12,33,35,51,52,53,56,60);
        System.out.println(findMiniDifferenceNumbers(numbers,8));
    }
    //求出list
    public static List<Integer> findMiniDifferenceNumbers2(List<Integer> list, int num){
        List<Integer> newList  =new ArrayList<>();
        for (Integer integer : list) {
            newList.add(Math.abs(integer-num));
        }

        return null;
    }

    /**
     * 通过计算map  ->Treemap
     * @param list
     * @param num
     * @return
     */
    public static List<Integer> findMiniDifferenceNumbers(List<Integer> list, int num){
        //step 1 求出说有值与此值里 ，放入hashMap
        Map<Integer,Integer> hashMap= new HashMap<Integer,Integer>() ;
        for (Integer integer : list) {
            hashMap.put(integer,Math.abs(integer-num));
        }
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int i =hashMap.get(o1)>=hashMap.get(o2)? 1:-1;
                return i;
            }
        };
        //step 2 遍历hashMap 插入treeMap中
        TreeMap<Integer,Integer> treeMap= new TreeMap<Integer,Integer>(comparator) ;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            treeMap.put(entry.getKey(),entry.getValue());
        }

        //step 3 遍历hashMap 直到与treeMap中第一个值不同为止，输出前面的到list中
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println("list中的"+entry.getKey()+"与"+num+"的差绝对值为"+entry.getValue());
        }
        return null;
    }
}
