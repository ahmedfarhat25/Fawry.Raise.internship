package com.FawryRise.Journey;

import com.FawryRise.Journey.model.*;
import com.FawryRise.Journey.ObserverPackage.*;
import com.FawryRise.Journey.model.payment.*;
import com.FawryRise.Journey.model.product.*;
import com.FawryRise.Journey.service.*;
import com.FawryRise.Journey.model.Shiping.*;
public class Main {
    public static void main(String[] args) {
        // Setup
        Customer customer = new Customer("C001", "John Doe", "john@example.com", 1000.0);
        Cart cart = new Cart("CRT001", customer);

        // Create products
        Product cheese = ProductFactory.createProduct("expirable", "P001", "Cheese", 100.0,
                "Fresh cheese", new Date(System.currentTimeMillis() + 86400000), 10); // expires in 1 day
        Product tv = ProductFactory.createProduct("shippable", "P002", "TV", 500.0,
                "Smart TV", 5000.0, "123 Main St", new StandardShipping());

        // Add to cart
        cart.addProduct(new ProductInCart(cheese, 2));
        cart.addProduct(new ProductInCart(tv, 1));

        // Checkout
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(customer, cart);
    }
}