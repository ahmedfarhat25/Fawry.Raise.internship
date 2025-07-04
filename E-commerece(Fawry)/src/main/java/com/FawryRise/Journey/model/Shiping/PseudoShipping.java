package com.FawryRise.Journey.model.Shiping;

import com.FawryRise.Journey.model.product.ShippableProduct;

public class PseudoShipping {
    public static boolean shipProduct(ShippableProduct product) {
        System.out.println("Shipping product " + product.getName() +
                " to " + product.getShippingAddress());
        System.out.println("Shipping cost: $" + product.calculateShippingCost());
        return true;
    }
}