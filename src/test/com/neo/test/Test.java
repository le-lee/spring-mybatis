package com.neo.test;

import com.neo.pojo.User;
import com.neo.service.UserService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test {

    @Autowired
    private UserService userService;

    @org.junit.Test
    public void testGetUser(){
        String userId = "1";
        User user = userService.getUser(userId);
        System.out.println(user);
    }
}
