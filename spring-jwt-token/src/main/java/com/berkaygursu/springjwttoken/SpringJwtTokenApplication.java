package com.berkaygursu.springjwttoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringJwtTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtTokenApplication.class, args);
    }

}
