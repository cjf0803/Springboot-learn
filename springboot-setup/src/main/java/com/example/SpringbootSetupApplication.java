package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.test.mapper")
public class SpringbootSetupApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSetupApplication.class, args);
    }

}
