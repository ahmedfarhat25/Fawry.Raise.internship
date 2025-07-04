package com.FawryRise.Journey.ObserverPackage;

public class SMSNotification implements OrderObserver {
    @Override
    public void update(String orderId, String status) {
        System.out.println("SMS: Order " + orderId + " status: " + status);
    }
}