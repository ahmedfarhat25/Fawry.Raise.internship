package com.FawryRise.Journey.model.Shiping;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShipping(double weight) {
        return weight * 10; // $10 per kg
    }
}