package com.zpself.module.springSecurity.security;

import com.alibaba.fastjson.JSON;
import com.zpself.module.redis.RedisUtil;
import com.zpself.module.springSecurity.Enums.ResultEnum;
import com.zpself.module.springSecurity.VO.ResultVO;
import com.zpself.module.springSecurity.entity.SelfUserDetails;
import com.zpself.module.springSecurity.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zzx
 * @date: 2018/10/15 16:12
 * @description: 用户登录成功时返回给前端的数据
 */
@Component
public class AjaxAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Autowired
    RedisUtil redisUtil;
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        SelfUserDetails userDetails = (SelfUserDetails) authentication.getPrincipal();

        String jwtToken = JwtTokenUtil.generateToken(userDetails.getUsername(), 150000);

        HashMap<String,Object> hash = new HashMap<>();
        hash.put("id",userDetails.getId());
        hash.put("username",userDetails.getUsername());
        hash.put("authorities",userDetails.getAuthorities());
        redisUtil.hset(jwtToken,hash);
        httpServletResponse.getWriter().write(JSON.toJSONString(ResultVO.result(ResultEnum.USER_LOGIN_SUCCESS,jwtToken,true)));
    }
}
