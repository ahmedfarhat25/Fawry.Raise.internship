package com.FawryRise.Journey.model.product;

public interface Shippable {
    double calculateShippingCost();
    String getShippingAddress();
    void setShippingAddress(String address);
}