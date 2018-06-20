package com.elab.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhub
 * @create 2018/6/15 17:37
 * @email zhub1@elab-plus.com
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloService() {
        return restTemplate.getForEntity("http://service/request/test", String.class).getBody();
    }

    public String helloFallBack() {
        return "Error occurred!";
    }
}
