package com.dandan.client3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.dandan.client3.mapper"})
public class Client3Application {

    public static void main(String[] args) {
        SpringApplication.run(Client3Application.class, args);
    }

}
