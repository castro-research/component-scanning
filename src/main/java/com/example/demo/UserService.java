package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserService {

    @Autowired
    EmailService emailService;

    public UserService() {
        System.out.println(emailService); // null
        System.out.println("UserService instance");
//        emailService.hello();
    }

    @PostConstruct
    public void init() {
        // Autowired é injetado após o construtor
        // com.example.demo.EmailService@2d8f2f3a
        System.out.println(emailService);
    }

    public void hello() {
        System.out.println("Oi");
    }
}