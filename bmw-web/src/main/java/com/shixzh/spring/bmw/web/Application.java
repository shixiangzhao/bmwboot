package com.shixzh.spring.bmw.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/6 15:06
 */
@SpringBootApplication
@ComponentScan(basePackages= {"com.shixzh.spring.bmw.controller"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}