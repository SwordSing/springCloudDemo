package com.elab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhub
 * @create 2018/6/19 16:31
 * @email zhub1@elab-plus.com
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class, args);
    }
}
