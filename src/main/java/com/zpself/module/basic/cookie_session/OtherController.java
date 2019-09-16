package com.zpself.module.basic.cookie_session;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController()
@RequestMapping("/other")
public class OtherController {


    @GetMapping("/getCookie")
    public String create(HttpServletRequest request){
        Cookie[] ck_sum= request.getCookies();
        return "upload";
    }


}
