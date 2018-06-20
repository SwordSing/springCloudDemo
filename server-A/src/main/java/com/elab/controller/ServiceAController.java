package com.elab.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhub
 * @create 2018/6/19 16:25
 * @email zhub1@elab-plus.com
 **/
@Controller
@RequestMapping("/request")
public class ServiceAController {

    @Value("${server.port}")
    String port;

    @ResponseBody
    @RequestMapping(value = "/")
    public String serviceHi() {
        return "Hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/test")
    public String service() {

        return "Service A: " + port;
    }
}
