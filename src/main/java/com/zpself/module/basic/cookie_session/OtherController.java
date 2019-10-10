package com.zpself.module.basic.cookie_session;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController()
@RequestMapping("/other")
@Api(value="other_controller",tags={"other操作接口"})
public class OtherController {


    @GetMapping("/getCookie")
    @ApiOperation(value="获取Cookie", notes="获取Cookie")
    public String create(HttpServletRequest request){
        Cookie[] ck_sum= request.getCookies();
        return "upload";
    }


}
