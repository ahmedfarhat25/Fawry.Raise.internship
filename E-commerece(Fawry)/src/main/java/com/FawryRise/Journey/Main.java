package com.FawryRise.Journey;

import com.FawryRise.Journey.model.*;
import com.FawryRise.Journey.ObserverPackage.*;
import com.FawryRise.Journey.model.payment.*;
import com.FawryRise.Journey.model.product.*;
import com.FawryRise.Journey.service.*;
import com.FawryRise.Journey.model.Shiping.*;

public class Main {
    public static void main(String[] args) {
        // Setup dependencies
        PaymentInterface paymentGateway = new PseudoPayment();
        PaymentService paymentService = new PaymentService(paymentGateway);
        CartCalculator cartCalculator = new CartCalculator();
        ShippingStrategy shippingStrategy = new StandardShipping();

        // Create notification system
        OrderSubject orderSubject = new OrderSubject();
        orderSubject.addObserver(new EmailNotification());
        orderSubject.addObserver(new SMSNotification());

        // Create products using factory
        Product ebook = ProductFactory.createProduct("digital", "P001", "Java Programming", 29.99,
                "Learn Java programming", "http://download.com/java", "5MB");

        Product laptop = ProductFactory.createProduct("shippable", "P002", "Laptop", 999.99,
                "High performance laptop", 2.5, "123 Main St, Cairo", shippingStrategy);

        // Create customer and cart
        Customer customer = new Customer("C001", "John Doe", "john@example.com");
        Cart cart = new Cart("CRT001", customer);
        customer.addCart(cart);

        // Add products to cart
        cart.addProduct(new ProductInCart(ebook, 1));
        cart.addProduct(new ProductInCart(laptop, 1));

        // Process order
        orderSubject.notifyObservers(cart.getId(), "created");

        double total = cartCalculator.calculateTotalWithShipping(cart);
        System.out.println("Order total: $" + total);

        if (paymentService.processPayment(cart, total)) {
            orderSubject.notifyObservers(cart.getId(), "paid");

            // Process shipping for shippable products
            cart.getProducts().stream()
                    .filter(p -> p.getProduct() instanceof Shippable)
                    .forEach(p -> {
                        ShippableProduct sp = (ShippableProduct) p.getProduct();
                        PseudoShipping.shipProduct(sp);
                    });

            orderSubject.notifyObservers(cart.getId(), "completed");
        } else {
            orderSubject.notifyObservers(cart.getId(), "payment_failed");
        }
    }
}