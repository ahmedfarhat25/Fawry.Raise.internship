package com.FawryRise.Journey.service;

import com.FawryRise.Journey.model.Customer.Cart;
import com.FawryRise.Journey.model.product.Shippable;

public class CartCalculator {
    public double calculateTotal(Cart cart) {
        return cart.getProducts().stream()
                .mapToDouble(p -> p.getProduct().getPrice() * p.getQuantity())
                .sum();
    }

    public double calculateTotalWithShipping(Cart cart) {
        double total = calculateTotal(cart);
        total += cart.getProducts().stream()
                .filter(p -> p.getProduct() instanceof Shippable)
                .mapToDouble(p -> ((Shippable)p.getProduct()).calculateShippingCost())
                .sum();
        return total;
    }
}