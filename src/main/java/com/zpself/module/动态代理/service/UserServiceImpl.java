package com.zpself.module.动态代理.proxy;

import com.zpself.module.动态代理.entity.User;

/**
 * @author zengpeng
 * @date 2019/9/6
 */
public class UserServiceImpl implements UserService {

    @Override
    public User getUserByName(String name) {
        User user = new User();
        user.setName(name);
        user.setAge(25);
        System.out.println(user);
        return user;
    }
}
