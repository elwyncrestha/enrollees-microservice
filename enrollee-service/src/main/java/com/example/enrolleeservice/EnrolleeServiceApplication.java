package com.example.enrolleeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EntityScan(basePackages = "com.example.enrolleeservice")
@EnableJpaRepositories(basePackages = "com.example.enrolleeservice")
public class EnrolleeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnrolleeServiceApplication.class, args);
    }

}
