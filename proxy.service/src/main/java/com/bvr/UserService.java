package com.bvr;

import java.util.List;
public interface UserService {
    void createUser(String userName);
    User getUserById(Long userId);
    List<User> getAllUsers();
}
