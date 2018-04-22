package com.flysun.hystrixfeign.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sunfei on 2018/4/22.
 */
@Component("computeServiceClientHystrix")
public class ComputeServiceClientHystrix implements ComputeServiceClient2 {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }

}
