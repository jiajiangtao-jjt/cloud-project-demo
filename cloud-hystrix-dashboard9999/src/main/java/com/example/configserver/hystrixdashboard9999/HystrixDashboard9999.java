package com.example.configserver.hystrixdashboard9999;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9999 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9999.class,args);
    }
}
