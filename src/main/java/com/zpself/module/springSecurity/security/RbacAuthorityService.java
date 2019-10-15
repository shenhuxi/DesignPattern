package com.zpself.module.springSecurity.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: zzx
 * @date: 2018/10/16 9:54
 * @description: 权限访问控制
 */
@Component("rbacauthorityservice")
public class RbacAuthorityService {
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {

        Object userInfo = authentication.getPrincipal();
        boolean hasPermission  = false;
        if (userInfo instanceof UserDetails) {
            Collection<? extends GrantedAuthority> authorities = ((UserDetails) userInfo).getAuthorities();
            Set<String> collect = authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toSet());
            //获取资源
           if(collect.contains(request.getRequestURI())){
               hasPermission =  true;
           }
            return hasPermission;
        } else {
            return false;
        }
    }
}
