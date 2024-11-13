package com.yupi.example.provider;

import com.yupi.example.common.model.User;
import com.yupi.example.common.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("User name: " + user.getName());
        return user;
    }
}
