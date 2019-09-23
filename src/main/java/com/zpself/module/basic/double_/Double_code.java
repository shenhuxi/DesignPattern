package com.zpself.module.basic.double_;

import java.math.BigDecimal;

public class Double_code {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        System.out.println(a+b);

        BigDecimal ba = new BigDecimal("0.1");
        BigDecimal bb = new BigDecimal("0.2");
        System.out.println(ba.add(bb).toString());
    }
}
