package com.FawryRise.Journey.ObserverPackage;

import java.util.ArrayList;
import java.util.List;

public class OrderSubject {
    private List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String orderId, String status) {
        observers.forEach(o -> o.update(orderId, status));
    }
}