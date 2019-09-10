package com.zpself.module.mybatis.basic.dao;

import java.util.List;

import com.zpself.module.mybatis.basic.entity.User;

public interface UserDao {

    public void insert(User user);
    
    public User findUserById (int userId);
    
    public List<User> findAllUsers();
    
}