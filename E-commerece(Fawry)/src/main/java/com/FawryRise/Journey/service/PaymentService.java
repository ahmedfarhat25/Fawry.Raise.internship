package com.FawryRise.Journey.service;

import com.FawryRise.Journey.model.Customer.Cart;
import com.FawryRise.Journey.payment.PaymentInterface;

public class PaymentService {
    private PaymentInterface paymentGateway;

    public PaymentService(PaymentInterface paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean processPayment(Cart cart, double amount) {
        return paymentGateway.processPayment(cart, amount);
    }
}