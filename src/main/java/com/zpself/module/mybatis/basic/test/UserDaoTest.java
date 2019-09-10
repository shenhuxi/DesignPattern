package com.zpself.module.mybatis.basic.test;

import com.zpself.module.mybatis.basic.dao.UserDao;
import com.zpself.module.mybatis.basic.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserDaoTest {

    @Test
    public void findUserById() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        int id= 1;
        User user = userMapper.findUserById(id);
        Assert.assertNotNull("没找到数据",id+"");
        System.out.println(user);
    }
    
    //Mybatis 通过SqlSessionFactory获取SqlSession, 然后才能通过SqlSession与数据库进行交互
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;  
        String resource = "configuration.xml";  
        try {  
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources
                    .getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();  
        }  
        return sessionFactory;  
    }  
    
}