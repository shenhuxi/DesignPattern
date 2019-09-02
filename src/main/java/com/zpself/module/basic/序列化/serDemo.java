package com.zpself.module.basic.序列化;

import java.io.*;

/**
 * 序列化和反序列化的操作
 * */
public class serDemo{
    public static void main(String[] args) throws Exception{
        ser(); // 序列化
        dser(); // 反序列话
    }
  
    public static void ser()throws Exception{
        File file = new File("C:\\Users\\cn\\Desktop\\gc" + File.separator + "hello.txt");
        ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(new Person1("rollen", 20));
        out.close();
    }
  
    public static void dser()throws Exception{
        File file = new File("C:\\Users\\cn\\Desktop\\gc" + File.separator + "hello.txt");
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        Object obj =input.readObject();
        input.close();
       System.out.println(obj);
    }
}