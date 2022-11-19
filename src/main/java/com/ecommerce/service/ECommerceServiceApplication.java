package com.ecommerce.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.ecommerce.service.config.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class ECommerceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceServiceApplication.class, args);
	}

}
