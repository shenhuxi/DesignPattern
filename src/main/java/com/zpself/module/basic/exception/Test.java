package com.zpself.module.basic.exception;

import java.io.IOException;

/**
 * @author zengpeng
 * @date 2019/6/14
 */
public class Test {
    public static void main(String[] args) {
        try {
            badMethod();
            System.out.print("A");
        } catch (RuntimeException ex) {
            System.out.print("B");
            throw new RuntimeException();
        } catch (Exception ex1) {
            System.out.print("C");
        } finally {
            System.out.print("D");
        }
        System.out.print("E");
    }
    public static void badMethod() {
        throw new RuntimeException();
    }
}
