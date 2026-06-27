package com.example.demo;

import org.springframework.stereotype.Service;

@Service
class UserService {
    public String name;

    public UserService() {
        this.name = "necas";
        System.out.println("UserService Created");
    }

    public UserService(String name) {
        this.name = name;
        System.out.println("UserService Created");
    }

    public void hello() {
        System.out.println("Oi");
    }
}