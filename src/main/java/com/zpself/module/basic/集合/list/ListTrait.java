package com.zpself.module.basic.集合.list;

import java.io.*;
import java.util.ArrayList;

/**
 * @author zengpeng
 * @date 2019/9/3
 */
public class ListTrait {
    public static void main(String[] args)  {
        //ArrayList<String> list1 = Lists.newArrayList("王五","王大五","王二五","王二百五");
        //ArrayList<String> list2 = Lists.newArrayList("王五","王tai五");
        ArrayList list = new ArrayList();
        //1.集合交集
       // boolean b = list1.retainAll(list2);

        //2.集合并集
        //boolean b = list1.addAll(list2);

        //3.集合差集
        //boolean b = list1.removeAll(list2);

        //4.add方法
        list.add("1");
        list.add(1,"2");//IndexOutOfBoundsException
        //list.addAll(null);
        //list.retainAll(null);
        System.out.println(list.size());

        //5.序列化
        File file = new File("C:\\Users\\cn\\Desktop\\gc" + File.separator + "helloList.txt");
        try( ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Math.round(12.5));
        System.out.println(Math.round(-12.5));
    }
}
