package com.bvr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class UserServiceProxy implements UserService{

    @Autowired
    private UserServiceImpl userService;

    public void createUser(String userName) {
        userService.createUser(userName);
    }

    public User getUserById(Long userId) {
        return userService.getUserById(userId);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
