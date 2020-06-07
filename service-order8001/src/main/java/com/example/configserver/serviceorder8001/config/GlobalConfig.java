package com.example.configserver.serviceorder8001.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example"})
@MapperScan("com.example.serviceorder8001.mapper")
@EnableEurekaClient
@EnableHystrix
public class GlobalConfig {
}
