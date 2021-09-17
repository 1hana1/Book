package com.example.book.entity;

import lombok.Data;

@Data
public class User {
    public String username = "123";
    public String password = "123456";

    public User(){}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
