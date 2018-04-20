package com.flysun.hystrixfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class HystrixFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixFeignApplication.class, args);
	}
}
