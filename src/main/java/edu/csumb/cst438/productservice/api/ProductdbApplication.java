package edu.csumb.cst438.productservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.csumb.cst438.productservice.api.products.Product;

@SpringBootApplication
public class ProductdbApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProductdbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		return;
		/*repository.deleteAll();

		// save a couple of customers
		//repository.save(new Product("CPU", "Central Processing Unit", 5, 349.99));
		//repository.save(new Product("GPU", "Graphics Processing Unit", 3, 399.99));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Product customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByName("CPU"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");*/

	}

}