package com.photoapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaDiscoveryServiceApplication.class, args);
	}

}
