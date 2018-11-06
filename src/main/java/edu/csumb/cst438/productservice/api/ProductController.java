package edu.csumb.cst438.productservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import edu.csumb.cst438.productservice.api.products.Product;
import edu.csumb.cst438.productservice.business.Manager;

@RestController
public class ProductController {
    @Autowired
    Manager manager;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/Product")
    @ResponseBody
    List<Product> getProducts(){
        return manager.getProductList();
    }

    @GetMapping ("/test")
    @ResponseBody
    String getTestString(){
        return "test";
    }

    @GetMapping("/")
    public String home() {
        return "This is a trivial service that demonstrates how a Eureka Client can register with a Eureka Server";
    }
}