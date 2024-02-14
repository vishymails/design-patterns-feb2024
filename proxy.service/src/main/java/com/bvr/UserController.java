package com.bvr;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userServiceProxy;

    @PostMapping("/users")
    public ResponseEntity<Void> createUser(@RequestBody String userName){
        userServiceProxy.createUser(userName);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Long userId){
        User user = userServiceProxy.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userServiceProxy.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
