package com.nacho.bombonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class BombonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BombonServiceApplication.class, args);
	}

}
