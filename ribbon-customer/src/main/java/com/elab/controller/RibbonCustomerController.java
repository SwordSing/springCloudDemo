package com.elab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.elab.service.HelloService;

/**
 * @author zhub
 * @create 2018/6/15 17:36
 * @email zhub1@elab-plus.com
 **/
@Controller
@RequestMapping("ribbon-customer")
public class RibbonCustomerController {

    @Autowired
    HelloService helloService;

    @ResponseBody
    @RequestMapping(value = "/request")
    public String customerRequest() {
        String result = helloService.helloService();
        System.out.print("result " + result + "\n");

        return result;
    }
}
