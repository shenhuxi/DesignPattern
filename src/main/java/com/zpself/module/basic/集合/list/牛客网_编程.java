package com.zpself.module.basic.集合.list;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class 牛客网_编程 {


    /**
     * 1.二维数组中查找数
     */
    public static boolean Find(int target, int [][] array) {
        for (int[] ints : array) {
           if(ints.length>1 && target >= ints[0] && target <= ints[ints.length - 1]) {
               for (int anInt : ints) {
                   if (anInt == target)
                       return true;
               }
           }
        }
        return false;
    }
    /**
     * 2.一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     */
    public static int JumpFloor(int target) {
        if(target == 1 )return 1;
        if(target == 2 )return 2;
        return  JumpFloor(target-1)+JumpFloor(target-2);
    }

    /**
     * 3.输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     */
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {

        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root=new TreeNode(pre[startPre]);

        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                break;
            }

        return root;
    }
    public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }

    /**
     * 4.用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
     */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    /**
     * 5.一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */
    public int JumpFloorII(int target) {
        //int pow =(int) Math.pow(2, target - 1);
        if(target==0 || target ==1) return target;
        return JumpFloorII(target-1)*2;
    }
    /**
     * 6.输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     */
    @Test
    public void NumberOf1() {
        //  return Integer.bitCount(n);
        String s = Integer.toBinaryString(7);
        System.out.println(s);
        int n = 0;
        for (char c : s.toCharArray()) {
            if(c=='1') n++;
        }
        System.out.println(n);
    }
    /**
     * 7.输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
     */
    private static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if(input.length==0 || k<=0 || k>input.length) return new ArrayList<>();
        ArrayList<Integer> result  = new ArrayList<>(k);
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            if(i<k){
                max = input[i]>max ?input[i] :max;
                result.add(input[i]);
                continue;
            }
            if(input[i]<max){
              result.remove(new Integer(max));
              result.add(input[i]);
              max = result.stream().max(Comparator.comparingInt(o -> o)).get();
            }
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(arr,10));
    }
}