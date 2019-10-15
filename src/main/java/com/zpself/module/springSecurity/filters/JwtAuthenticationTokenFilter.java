package com.zpself.module.springSecurity.filters;

import com.alibaba.fastjson.JSON;
import com.zpself.module.redis.RedisUtil;
import com.zpself.module.springSecurity.Enums.ResultEnum;
import com.zpself.module.springSecurity.SelfUserDetailsService;
import com.zpself.module.springSecurity.VO.ResultVO;
import com.zpself.module.springSecurity.entity.SelfUserDetails;
import com.zpself.module.springSecurity.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * @author: zzx
 * @date: 2018/10/15 17:30
 * @description: 确保在一次请求只通过一次filter，而不需要重复执行
 */
@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    @Autowired
    SelfUserDetailsService userDetailsService;
    @Autowired
    RedisUtil redisUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String authToken = authHeader.substring("Bearer ".length());
            String username = JwtTokenUtil.parseToken(authToken,"_secret");
            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                //这里需要从redis中获取数据
                if(!redisUtil.hasKey(authToken)){
                    response.getWriter()
                            .write(JSON.toJSONString(ResultVO.result(ResultEnum.USER_NEED_AUTHORITIES,false)));
                    return;
                }

                HashMap<String,Object> hashMap = (HashMap<String, Object>)redisUtil.hget(authToken);
                SelfUserDetails user = new SelfUserDetails();
                user.setId(Long.parseLong(hashMap.get("id").toString()));
                user.setUsername(hashMap.get("username").toString());
                user.setAuthorities((Set<? extends GrantedAuthority>) hashMap.get("authorities"));
                Object authorities = hashMap.get("authorities");
                UsernamePasswordAuthenticationToken authentication =
                            new UsernamePasswordAuthenticationToken(user, null, (Collection<? extends GrantedAuthority>) hashMap.get("authorities"));
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }

        filterChain.doFilter(request, response);
    }
}
