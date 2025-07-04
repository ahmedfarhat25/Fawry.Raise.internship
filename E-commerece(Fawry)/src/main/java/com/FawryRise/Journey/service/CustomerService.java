package com.FawryRise.Journey.service;

import com.FawryRise.Journey.model.Customer.Cart;
import com.FawryRise.Journey.model.Customer.Customer;
import com.FawryRise.Journey.model.payment.PaymentInterface;
import com.FawryRise.Journey.model.product.Product;

public class CustomerService {
    private static CustomerService customerService;

    private CustomerService() {

    }

    public static CustomerService getCustomerService() {
        if (customerService == null) {
            customerService = new CustomerService();
        }
        return customerService;
    }

    Customer createCustomer(String customerName, String customerEmail) {
        Customer customer = new Customer(customerName, customerEmail);
        customer.setName(customerName);
        return customer;
    }

    void addPaymentInterface(Customer customer, PaymentInterface paymentInterface) {
        customer.addPaymentMethod(paymentInterface);
    }

    boolean addProductToCart(Customer customer, Product product, int quantity) {
        Cart cart = customer.getCart();
        return cart.addProduct(product, quantity);
    }

    void cartOverView(Customer customer) {
        System.out.println("------Cart Overview------");
        System.out.println("-------------------------");
        System.out.println(customer.getCart());
        System.out.println("-------------------------");
    }

    boolean checkOutCart(Customer customer) {
        return customer.checkoutCart();
    }
}
