package com.example.demo;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//Antes ---> appConfig
//Depois ---> appConfig
//Antes ---> emailService
//Depois ---> emailService
//null
//UserService instance
//Antes ---> userService
//com.example.demo.EmailService@45c7e403
//Depois ---> userService

@Component
class LekitoBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(
            Object bean,
            String beanName
    ) {
//        System.out.println("Antes ---> " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(
            Object bean,
            String beanName
    ) {
//        System.out.println("Depois ---> " + beanName);
        return bean;
    }
}
