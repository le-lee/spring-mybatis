package com.neo.service.test;

import com.neo.dao.UserMapper;
import com.neo.pojo.User;
import com.neo.service.UserService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class Test {


//    @Before
//    public void before(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
//        context.getBean("userMapper");
//    }

//    @Resource
//    private UserService userService;

//    @Resource
    @Autowired
    UserMapper userMapper;

    @org.junit.Test
    public void testGetUser() {
        String userId = "1";
        User user = userMapper.getUser(userId);
        System.out.println(user);
    }
}
