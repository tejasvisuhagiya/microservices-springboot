package com.globomart.productcatlogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductCatlogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatlogueApplication.class, args);
	}

}
