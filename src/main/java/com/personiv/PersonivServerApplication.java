package com.personiv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PersonivServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonivServerApplication.class, args);
	}
}
