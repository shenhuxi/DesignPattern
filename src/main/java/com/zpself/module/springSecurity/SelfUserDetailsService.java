package com.zpself.module.springSecurity;

import com.zpself.module.springSecurity.entity.SelfUserDetails;
import com.zpself.module.system_module.entity.SysPermission;
import com.zpself.module.system_module.entity.SysRole;
import com.zpself.module.system_module.entity.SysUser;
import com.zpself.module.system_module.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 登录获取用户信息的service
 */
@Slf4j
@Service("userDetailsService")
public class SelfUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Set<GrantedAuthority> authorities = new HashSet<>();
        // 从数据库中取出用户信息
        SysUser user = userService.findByUserName(username);
        // 判断用户是否存在
        log.info("查询用户密码以及 权限信息");
        if(user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        // 添加权限
        List<SysRole> userRoles = user.getRoles();
        for (SysRole role : userRoles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
            if(role.getPermissions()!=null && !role.getPermissions().isEmpty()){
                for (SysPermission permission : role.getPermissions()) {
                    authorities.add(new SimpleGrantedAuthority(permission.getName()));
                }
            }
        }
        // 返回UserDetails实现类
        SelfUserDetails selfUserDetails = new SelfUserDetails();
        selfUserDetails.setId(user.getId());
        selfUserDetails.setUsername(user.getName());
        selfUserDetails.setPassword(user.getPassword());
        selfUserDetails.setAuthorities(authorities);
        return selfUserDetails;
    }
}
