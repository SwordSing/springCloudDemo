package com.elab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhub
 * @create 2018/6/15 17:33
 * @email zhub1@elab-plus.com
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class RibbonCustomerApplication {

    @LoadBalanced // 开启负载均衡
    @Bean         // 注册一个有容错功能的RestTemplate
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonCustomerApplication.class, args);
    }
}
