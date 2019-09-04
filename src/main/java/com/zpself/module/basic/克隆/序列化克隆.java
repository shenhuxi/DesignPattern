package com.zpself.module.basic.克隆;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * @author zengpeng
 * @date 2019/9/3
 */
public class 序列化克隆 {

   序列化克隆(){};
    public static void main(String[] args) {
        Person parent =new Person("父",35);
        Person children =new Person("子",15);
        children.setParent(parent);

        Person cloneObj = null;

        try{
            //写入字节流
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bao);
            objectOutputStream.writeObject(children);

            //分配内存，写入原始对象，生成新对象
            ByteArrayInputStream ios = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(ios);


            //返回生成的新对象
            cloneObj = (Person) ois.readObject();
            System.out.println(cloneObj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
