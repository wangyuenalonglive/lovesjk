package com.wyn.service.impl;

import com.wyn.entity.User;
import com.wyn.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setPassword("123456");
        return user;
    }


}

