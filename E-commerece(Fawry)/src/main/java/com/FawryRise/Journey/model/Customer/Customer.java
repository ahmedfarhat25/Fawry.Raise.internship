package com.FawryRise.Journey.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String name;
    private String email;
    private List<Cart> carts;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.carts = new ArrayList<>();
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<Cart> getCarts() { return carts; }
    public void addCart(Cart cart) { this.carts.add(cart); }
}