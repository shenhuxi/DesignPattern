package com.zpself.module.basic.编码;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author zengpeng
 * @date 2019/9/1
 */
public class TestGBK {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //-25,-112,-78,
        String s = "琲";
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            System.out.print(aByte+",");
        }

        System.out.println("------以UTF-8解析成byte[],那就用UTF-8转换回来，再使用GBK得到byte[]----------");
        String s3 = new String(bytes, StandardCharsets.UTF_8);
        byte[] gbks = s3.getBytes("GBK");
        for (byte aByte : gbks) {
            System.out.print(aByte+",");
        }
    }
}
