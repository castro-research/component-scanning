package com.example.demo;

import org.springframework.stereotype.Service;

@Service
class UserService {
    public UserService() {
        System.out.println("UserService Created");
    }

    public void hello() {
        System.out.println("Oi");
    }
}