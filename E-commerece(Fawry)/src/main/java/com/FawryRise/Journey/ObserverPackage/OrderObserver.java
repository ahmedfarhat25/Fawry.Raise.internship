package com.FawryRise.Journey.ObserverPackage;

public interface OrderObserver {
    void update(String orderId, String status);
}