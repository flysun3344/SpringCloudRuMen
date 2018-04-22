package com.flysun.apigatewayfillter;

import com.flysun.apigatewayfillter.fillter.AccessFillter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayFillterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayFillterApplication.class, args);
	}

	@Bean
	public AccessFillter accessFillter() {
		return new AccessFillter();
	}
}
