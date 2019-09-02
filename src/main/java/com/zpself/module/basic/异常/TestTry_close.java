package com.zpself.module.basic.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zengpeng
 * @date 2019/9/2
 */
public class TestTry_close {
    public static void main(String[] args) throws Throwable {
        TestTry_close c=new TestTry_close();
        c.finalize();
        try(FileInputStream f= new FileInputStream("C:\\Users\\cn\\zpFile\\1__java基础篇的笔记")) {
            byte[] b = new byte[1024];
            int len ;
            while((len=f.read(b))!=-1){
                System.out.println(new String(b));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("我要被回收了....救命啊！");
    }
}
