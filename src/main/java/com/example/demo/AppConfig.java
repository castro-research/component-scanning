package com.example.demo;

class AppConfig {
    public UserService userService() {
        System.out.println("@Bean deve ser executado");
        return new UserService();
    }
}