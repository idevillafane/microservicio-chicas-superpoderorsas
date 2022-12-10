package com.nacho.bellotaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class BellotaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BellotaServiceApplication.class, args);
	}

}
