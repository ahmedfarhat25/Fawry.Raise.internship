package com.FawryRise.Journey.model.Customer;
import com.FawryRise.Journey.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String id;
    private Customer customer;
    private List<ProductInCart> products;

    public Cart(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public Customer getCustomer() { return customer; }
    public List<ProductInCart> getProducts() { return products; }
    public void addProduct(ProductInCart product) { this.products.add(product); }
}