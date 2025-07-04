package com.FawryRise.Journey.model.payment;

import com.FawryRise.Journey.model.Customer.Cart;

public interface PaymentInterface {
    boolean processPayment(Cart cart, double amount);
    String getPaymentMethod();
}