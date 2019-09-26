package com.zpself.module.jvm_test;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
//VM options -Xmx80m -Xms80m -Xmn20m -Xss128k -XX:+UseConcMarkSweepGC
public class Jvm_Test_SoftReference {
    public final Integer a= 10;
    private static List<Object> list = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        testSoftReference();

    }
    private static void testSoftReference() throws InterruptedException {
        byte[] buff = null;


        while (true) {
            for (int i = 0; i < 10; i++) {
                buff= new byte[1024 * 1024* 4];
                SoftReference<byte[]> sr = new SoftReference<>(buff);
                buff=null;
                list.add(sr);
            }
            Thread.sleep(1000);
        }

       // System.gc(); //主动通知垃圾回收

//        for(int i=0; i < list.size(); i++){
//            Object obj = ((SoftReference) list.get(i)).get();
//            System.out.println(obj);
//        }

    }
}
