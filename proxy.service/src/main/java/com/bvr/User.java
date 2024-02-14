package com.bvr;

public class User {
    private Long userId;
    private String userName;

    public User(Long userId, String userName){
        this.userId = userId;
        this.userName = userName;
    }

    public Long getUserId(){
        return userId;
    }

    public String getUserName(){
        return userName;
    }
}
