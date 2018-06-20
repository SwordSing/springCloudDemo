package com.elab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhub
 * @create 2018/6/19 16:23
 * @email zhub1@elab-plus.com
 **/
@SpringBootApplication
@EnableEurekaClient
public class ServiceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }
}
