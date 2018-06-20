package com.elab.controller;

import com.elab.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhub
 * @create 2018/6/19 13:47
 * @email zhub1@elab-plus.com
 **/
@Controller
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    TestService testService;

    @ResponseBody
    @RequestMapping(value = "/test")
    public String test() {
        return testService.service();
    }
}
