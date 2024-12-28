package com.sales.salesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // Enable Feign Clients
public class SalesdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalesdemoApplication.class, args);
    }
}
