package edu.csumb.cst438.productservice.api.products;

import org.springframework.data.annotation.Id;

public class Cart {

    @Id
    public String id;

    public String user_id;
    public Product[] products;


    public Cart() {}

    public boolean insertProduct(String id) {
        return false;
    }

    public boolean removeProduct(String id) {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }

}