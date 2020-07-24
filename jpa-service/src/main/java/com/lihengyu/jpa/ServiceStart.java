package com.lihengyu.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

@SpringBootApplication
@EnableEurekaClient
@EntityScan("com.lihengyu.entity")
public class ServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(ServiceStart.class,args);
    }
}
