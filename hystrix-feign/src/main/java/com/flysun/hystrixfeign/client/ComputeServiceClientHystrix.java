package com.flysun.hystrixfeign.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sunfei on 2018/4/19.
 */
@Component
public class ComputeServiceClientHystrix implements HystrixComputeServiceClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -99999;
    }
}
