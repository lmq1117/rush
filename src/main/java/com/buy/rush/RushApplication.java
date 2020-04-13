package com.buy.rush;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.buy.rush")
@MapperScan("com.buy.rush.dao")
public class RushApplication {

    public static void main(String[] args) {
        SpringApplication.run(RushApplication.class, args);
    }

}
