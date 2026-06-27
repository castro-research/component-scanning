package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main
{
    public static void main(String[] args)
    {
        var context = SpringApplication.run(Main.class, args);
        UserService service = context.getBean(UserService.class);

        System.out.println(service.name);
        service.hello();
        context.close();
    }
}