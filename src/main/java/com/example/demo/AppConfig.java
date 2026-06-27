package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {
    @Bean
    public UserService userService() {
        System.out.println("@Bean deve ser executado");
        return new UserService();
    }
}