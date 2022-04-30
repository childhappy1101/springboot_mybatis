package com.rays;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rays.mapper")
public class HelloWorld {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class,args);
    }
}
