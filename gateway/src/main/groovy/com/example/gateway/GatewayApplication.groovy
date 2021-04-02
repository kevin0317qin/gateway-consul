package com.example.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.hystrix.EnableHystrix

@SpringBootApplication
//@EnableHystrix
class GatewayApplication {

	static void main(String[] args) {
		SpringApplication.run(GatewayApplication, args)
	}

}
