package com.FawryRise.Journey.model.product;

import com.FawryRise.Journey.model.Shiping.ShippingStrategy;

public class ShippableProduct extends Product implements Shippable {
    private double weight;
    private String shippingAddress;
    private ShippingStrategy shippingStrategy;

    public ShippableProduct(String id, String name, double price, String description,
                            double weight, String shippingAddress, ShippingStrategy shippingStrategy) {
        super(id, name, price, description);
        this.weight = weight;
        this.shippingAddress = shippingAddress;
        this.shippingStrategy = shippingStrategy;
    }

    // Getters and shipping methods
    public double getWeight() { return weight; }
    @Override public double calculateShippingCost() { return shippingStrategy.calculateShipping(weight); }
    @Override public String getShippingAddress() { return shippingAddress; }
    @Override public void setShippingAddress(String address) { this.shippingAddress = address; }
    @Override public String getProductType() { return "Shippable"; }
}