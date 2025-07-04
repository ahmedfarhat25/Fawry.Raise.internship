package com.FawryRise.Journey.ObserverPackage;

public class EmailNotification implements OrderObserver {
    @Override
    public void update(String orderId, String status) {
        System.out.println("Email: Order " + orderId + " is now " + status);
    }
}