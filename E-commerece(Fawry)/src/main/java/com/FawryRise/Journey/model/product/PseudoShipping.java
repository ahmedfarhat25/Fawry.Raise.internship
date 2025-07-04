package com.FawryRise.Journey.model.product;

public class PseudoShipping {
    public static boolean shipProduct(ShippableProduct product, String address) {
        System.out.println("Shipping product " + product.getName() + " to " + address);
        System.out.println("Shipping cost: $" + product.calculateShippingCost());
        // In a real system, this would integrate with a shipping provider
        return true; // Always returns true for simulation
    }
}