package com.zpself.module.basic.algorithm;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zengpeng
 * @date 2019/6/14
 */
public class FindNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Lists.newArrayList(0,1,3,3,7,8,9,12,33,35,51,52,53,56,60);//8
        List<Integer> numbersAbs = Lists.newArrayList(8,7,5,5,1,2,4,25,27,43,44,45,48,52);//25
        int number = 57;
        //System.out.println(findMiniDifferenceNumbers(numbers,number));
        //System.out.println(findMiniDifferenceNumbersTwo(numbers,number));
        System.out.println(findMiniDifferenceNumbersThree(numbers,number));
    }

    /**
     * 3.通过二分法时间复杂度  （n+3）
     * @param list 目标list
     * @param findValue 目标值
     * @return 结果list
     */
    private static List<Integer>  findMiniDifferenceNumbersThree(List<Integer> list, int findValue){
        if(list==null || list.isEmpty()) {return null;}
        //step1 求出list与差值的新集合
        List<Integer> result = new ArrayList<>(2);
        //step2 二分法遍历得到最接近findValue的下表
        int start = 0;
        int end = list.size()-1;
        int change = 0;
        while (start<=end){
            int middle = (start+end)/2;
            int middleValue = list.get(middle);
            if (middleValue==findValue){
                result.add(findValue);
                break;
            }else{
                if(middleValue<findValue) {
                    start = middle+1;
                }else {
                    end = middle-1;
                }
                change= middle;
            }
        }
        //step3 判断是否有找到值，没找到则判断最后遍历附近值
        if(result.isEmpty()){
            int min = Math.abs(list.get(change - 1) - findValue);
            int middle = Math.abs(list.get(change) - findValue);
            int target = Math.min(min, middle);

            if(change + 1<list.size()){
                int max =Math.abs(list.get(change + 1) - findValue);
                target = Math.min(target, max);
                if(target==max){result.add(list.get(change + 1));}
            }
            if(target==middle){result.add(list.get(change ));}
            if(target==min){result.add(list.get(change - 1));}

        }
        return result;
    }

    /**
     * 2.通过遍历查询  时间复杂度  （3n）
     * @param list 目标list
     * @param findValue 目标值
     * @return 结果list
     */
    private static List<Integer>  findMiniDifferenceNumbersTwo(List<Integer> list, int findValue){
        if(list==null || list.isEmpty()) {return null;}
        //step1 求出list与差值的新集合
        List<Integer> newList = list.stream().map(numb -> Math.abs(numb - findValue)).collect(Collectors.toList());

        //step2 遍历擦寻最小值
        int min  = newList.stream()
                .mapToInt(numb -> numb)
                .summaryStatistics().getMin();

        //step3 遍历查找 为min值的对象
        return list.stream().filter(numb -> numb.equals(min+findValue) ||numb.equals(findValue-min)).collect(Collectors.toList());
    }

    /**
     * 1.通过计算map  ->TreeMap   --不易懂 时间复杂度（n*n）
     * @param list 目标list
     * @param num 目标值
     */
    private static List<Integer> findMiniDifferenceNumbers(List<Integer> list, int num){
        //step 1 求出说有值与此值里 ，放入hashMap
        Map<Integer,Integer> hashMap= new HashMap<>(10) ;
        for (Integer integer : list) {
            hashMap.put(integer,Math.abs(integer-num));
        }
        Comparator<Integer> comparator = (o1, o2) -> hashMap.get(o1)>=hashMap.get(o2)? 1:-1;
        //step 2 遍历hashMap 插入treeMap中
        TreeMap<Integer,Integer> treeMap= new TreeMap<>(comparator) ;
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
