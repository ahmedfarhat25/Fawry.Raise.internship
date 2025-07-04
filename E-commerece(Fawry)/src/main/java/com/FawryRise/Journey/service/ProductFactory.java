package com.FawryRise.Journey.service;

import com.FawryRise.Journey.product.*;
import com.FawryRise.Journey.model.Shiping.ShippingStrategy;

public class ProductFactory {
    public static Product createProduct(String type, String id, String name, double price,
                                        String description, Object... args) {
        switch(type.toLowerCase()) {
            case "digital":
                return new DigitalProduct(id, name, price, description,
                        (String)args[0], (String)args[1]);
            case "shippable":
                return new ShippableProduct(id, name, price, description,
                        (double)args[0], (String)args[1], (ShippingStrategy)args[2]);
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}