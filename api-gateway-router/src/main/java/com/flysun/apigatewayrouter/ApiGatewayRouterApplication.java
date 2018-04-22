package com.flysun.apigatewayrouter;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayRouterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayRouterApplication.class, args);
	}
}
