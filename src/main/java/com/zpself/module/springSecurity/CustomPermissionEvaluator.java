package com.zpself.module.springSecurity;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 自定义的权限判断
 */
@Component
public class CustomPermissionEvaluator implements PermissionEvaluator {
    @Override
    public boolean hasPermission(Authentication authentication, Object o, Object o1) {
        //Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) authentication.getAuthorities();
        User user = (User)authentication.getPrincipal();
        Collection<GrantedAuthority> authorities2 = user.getAuthorities();
        Set<String> grantedAuthorities = authorities2.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toSet());
        return grantedAuthorities.contains(o.toString()+o1.toString());
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable serializable, String s, Object o) {
        return false;
    }
}
