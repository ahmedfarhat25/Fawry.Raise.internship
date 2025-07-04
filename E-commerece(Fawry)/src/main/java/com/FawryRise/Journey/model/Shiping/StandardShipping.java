package com.FawryRise.Journey.model.Shiping;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShipping(double weight) {
        return weight * 5; // $5 per kg
    }
}