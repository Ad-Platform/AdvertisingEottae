package com.within.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        System.out.println("hello world!");
        SpringApplication.run(ConsumerApplication.class);
    }
}
