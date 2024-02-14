package com.bvr;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {
    public void createUser(String userName) {
        // implementation to create a new user

        User user = new User(1L, userName);
        System.out.println("User created successfully" + user.getUserName());

    }

    public User getUserById(Long userId) {
        // get user by id
        return new User(userId, "User Name");
    }

    public List<User> getAllUsers() {
        // get all users
        return new ArrayList<User>();
    }

}
