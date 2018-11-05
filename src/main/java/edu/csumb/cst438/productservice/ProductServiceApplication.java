package edu.csumb.cst438.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import edu.csumb.cst438.productservice.data.ProductRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ProductServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
    }
}
