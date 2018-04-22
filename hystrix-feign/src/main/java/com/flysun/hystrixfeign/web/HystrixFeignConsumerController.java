package com.flysun.hystrixfeign.web;

import com.flysun.hystrixfeign.client.ComputeServiceClient2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign实现的服务消费端
 * Created by sunfei on 2018/3/29.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@RestController
public class HystrixFeignConsumerController {
    @Autowired
    private ComputeServiceClient2 computeServiceClient2;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeServiceClient2.add(10, 20);
    }
}
