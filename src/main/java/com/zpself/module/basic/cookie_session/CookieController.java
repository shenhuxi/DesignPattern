package com.zpself.module.basic.cookie_session;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController()
@RequestMapping("/cookie")
public class CookieController {


    @GetMapping("/create")
    public String create(HttpServletRequest request) throws ClassNotFoundException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        ClassLoader pParent = classLoader.getParent();
        Class<?> aClass = classLoader.loadClass("com.zpself.module.basic.integer.String");

        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        Cookie ck1= new Cookie("username","李四");
        Cookie ck2= new Cookie("age","25");
        ck1.setPath("/");//设置位置，当前服务器路径下（以后有这个路径的子路径都带cookie）;
        ck1.setMaxAge(100);
        response.addCookie(ck1);
        response.addCookie(ck2);
        return "upload";
    }

    @PostMapping("/getCookie")
    public String create2(HttpServletRequest request){
        Cookie[] ck_sum= request.getCookies();
        return "upload";
    }

}
