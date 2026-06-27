package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {

    @Bean
    UserService userService(EmailService emailService) {
        System.out.println("UserService Created");
        return new UserService(emailService);
    }

    @Bean
    EmailService emailService() {
        System.out.println("EmailService Created");
        return new EmailService();
    }
}