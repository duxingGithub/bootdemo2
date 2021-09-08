package com.boot.bootdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.controller"})
public class Bootdemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Bootdemo1Application.class, args);
    }

}
