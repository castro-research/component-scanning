package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
//        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var context = new AnnotationConfigApplicationContext("com.example.demo");
        UserService service = context.getBean(UserService.class);

        System.out.println(service.name);
        service.hello();
        context.close();
    }
}