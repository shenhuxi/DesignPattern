package com.zpself.module.IOC.统一资源Resource.resource;

import org.springframework.core.io.*;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zengpeng
 * @date 2019/9/4
 */
public  class Resource_Test {
    public static void main(String[] args) {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        ResourceLoader resourceLoader2 = new FileSystemResourceLoader();

        Resource fileResource1 = resourceLoader2.getResource("C:\\Users\\cn\\Desktop\\gc/hello.txt");
        System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

        Resource fileResource2 = resourceLoader.getResource("/Users\\cn\\Desktop\\gc/hello.txt");
        System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));

        Resource urlResource1 = resourceLoader.getResource("file:/C:\\Users\\cn\\Desktop\\gc/hello.txt");
        System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

        Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
        System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));



    }
}
