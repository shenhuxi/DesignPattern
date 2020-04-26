package com.zpself.module.basic.string.replance;

import java.io.File;

public class StringTest {
    public static void main(String[] args) {
        String s = "/u01/micsdev/ht_for_web/ht_new/instance-enjoy/storage/display";
        System.out.println(s.lastIndexOf("/"));
        System.out.println(File.separator);
        System.out.println(s.substring(s.lastIndexOf(s.lastIndexOf("/"))));
    }
}
