package com.neo.service.impl;

import com.neo.dao.UserMapper;
import com.neo.pojo.User;
import com.neo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public User getUser(String userId) {
        return userMapper.getUser(userId);
    }
}
