package com.FawryRise.Journey.model.Customer;

import com.FawryRise.Journey.model.product.Product;

public class ProductInCart {
    private Product product;
    private int quantity;

    public ProductInCart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}