package com.example.springboottransaction2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootTransaction2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTransaction2Application.class, args);
    }

}
