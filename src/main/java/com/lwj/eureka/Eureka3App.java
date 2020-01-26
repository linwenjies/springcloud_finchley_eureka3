package com.lwj.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Euraka注册中心
 * @author linwenjie
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka3App 
{
    public static void main( String[] args ){
        SpringApplication.run(Eureka3App.class, args);
    }
}
