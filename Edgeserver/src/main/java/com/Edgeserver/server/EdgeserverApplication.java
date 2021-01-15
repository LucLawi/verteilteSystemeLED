package com.Edgeserver.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
//@EnableZuulProxy
@EnableEurekaClient
@EnableFeignClients
public class EdgeserverApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EdgeserverApplication.class, args);
	}

}




