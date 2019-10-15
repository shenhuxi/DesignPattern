package com.zpself.module.system_module.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptpasswored {
        public static void main(String[] args) {
            BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
            String encode = bc.encode("123");
            System.out.println(encode);
        }
}
