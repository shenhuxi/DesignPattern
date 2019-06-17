package com.zpself.module.basic.algorithm;

/**
 * @author zengpeng
 * @date 2019/6/17
 */
public class MyBinarySearch {
    public static void main(String[] args) {
        // TODO 实现二分法
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int findValue = 6;
        int result2 = searchRecursive(array, 0, array.length - 1, findValue);
        //int result = searchLoop(array, findValue);
        System.out.println(result2);
    }

    /**
     * while 循环实现有序数组的二分查找
     * @param array 数组
     * @param findValue 需要查找的值
     * @return 数据的下标
     */
    private static int searchLoop(int[] array,int findValue){
        if (array==null){return -1;}
        int start = 0;
        int end = array.length-1;

        while (start<=end){
            int middle = (start+end)/2;
            int middleValue = array[middle];
            if (middleValue==findValue){
                return middle;
            }else{
               if(middleValue<findValue) {
                   start = middle+1;
               }else {
                   end = middle-1;
               }
            }
        }
        return -1;
    }

    /**
     * while 循环实现有序数组的二分查找
     * @param array 数组
     * @param start 开始节点
     * @param end 结束
     * @param findValue 需要查找的值
     * @return 数据的下标
     */
    private static int searchRecursive(int[] array, int start, int end, int findValue) {
        if (array==null){return -1;}

        while (start<=end){
            int middle = (start+end)/2;
            int middleValue = array[middle];
            if (middleValue==findValue){
                return middle;
            }else{
                if(middleValue<findValue) {
                    start = middle+1;
                }else {
                    end = middle-1;
                }
                searchRecursive(array,start,end,findValue);
            }
        }
        return -1;
    }
}
