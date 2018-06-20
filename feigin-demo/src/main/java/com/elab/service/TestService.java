package com.elab.service;


import com.elab.service.impl.TestServiceFallBackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhub
 * @create 2018/6/15 18:34
 * @email zhub1@elab-plus.com
 **/
@FeignClient(value = "service", fallback = TestServiceFallBackImpl.class)
public interface TestService {

    @RequestMapping("/request/test")
    String service();
}
