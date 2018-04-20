package com.flysun.hystrixfeign.web;

import com.flysun.hystrixfeign.client.HystrixComputeServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign实现的服务消费端
 * Created by sunfei on 2018/3/29.
 */
@RestController
public class HystrixFeignConsumerController {
    @Autowired
    HystrixComputeServiceClient hystrixComputeServiceClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return hystrixComputeServiceClient.add(10, 20);
    }
}
