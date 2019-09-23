package com.zpself.module.jvm_test.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Jvm_Test_WeakReference {
    private static List<Object> list = new ArrayList<>();
    public static void main(String[] args) {
        testSoftReference();

    }
    private static void testSoftReference() {
        for (int i = 0; i < 10; i++) {
            byte[] buff= new byte[1024 * 1024* 4];
            WeakReference<byte[]> sr = new WeakReference<>(buff);
            list.add(sr);
        }

        System.gc(); //主动通知垃圾回收

        for(int i=0; i < list.size(); i++){
            Object obj = ((WeakReference) list.get(i)).get();
            System.out.println(obj);
        }

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
