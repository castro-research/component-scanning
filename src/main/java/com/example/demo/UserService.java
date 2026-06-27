package com.example.demo;

class UserService {
    public UserService(EmailService emailService) {
        System.out.println("UserService instance");
        emailService.hello();
    }

    public void hello() {
        System.out.println("Oi");
    }
}