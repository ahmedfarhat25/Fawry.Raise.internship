package com.FawryRise.Journey.model.payment;

import com.FawryRise.Journey.model.Customer.Cart;

public class PseudoPayment implements PaymentInterface {
    @Override
    public boolean processPayment(Cart cart, double amount) {
        System.out.println("Processing payment of $" + amount + " via " + getPaymentMethod());
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "PseudoPayment";
    }
}