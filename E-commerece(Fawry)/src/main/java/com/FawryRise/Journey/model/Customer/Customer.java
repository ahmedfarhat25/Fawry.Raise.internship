package com.FawryRise.Journey.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String name;
    private String email;
    private double balance;
    private List<Cart> carts;

    // Constructor and methods...
    public double getBalance() { return balance; }
    public void deductBalance(double amount) { balance -= amount; }
}