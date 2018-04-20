package com.flysun.hystrixribbon.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunfei on 2018/4/19.
 */
@Service
public class ComputeService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
        return restTemplate.getForEntity("http://compute-service/add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallback() {
        return "error";
    }
}
