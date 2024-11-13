package com.yupi.example.comsumer;

import com.yupi.example.common.model.User;
import com.yupi.example.common.service.UserService;
import com.yupi.yurpc.proxy.ServiceProxyFactory;

public class EasyConsumerExample {
    public static void main(String[] args) {
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("hello");
        User newUser = userService.getUser(user);
        /**
         * User getUser(User user){
         * print(user.username);
         */
        if (newUser != null){
            System.out.println(newUser.getName());
        }

    }
}
