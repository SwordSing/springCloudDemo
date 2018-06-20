package com.elab.service.impl;

import com.elab.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @author zhub
 * @create 2018/6/15 18:55
 * @email zhub1@elab-plus.com
 **/
@Component
public class TestServiceFallBackImpl implements TestService {

    @Override
    public String service() {
        return "error";
    }
}
