# Fawry.Raise.internship
# Fawry E-Commerce System

A Java-based e-commerce system implementation for FawryRise Journey program, following SOLID principles and design patterns.

## Features

- **Product Management**
  - Support for different product types (Digital, Shippable, Expirable)
  - Product inventory tracking
  - Expiration date handling for perishable goods

- **Shopping Cart**
  - Add/remove products with quantities
  - Quantity validation against available stock
  - Expiration date validation

- **Checkout System**
  - Subtotal calculation
  - Shipping cost calculation based on weight
  - Customer balance verification
  - Comprehensive error handling

- **Shipping Integration**
  - Multiple shipping strategies (Standard, Express)
  - Shipping notice generation
  - Weight-based calculations

## System Architecture
# 📦 Fawry E-Commerce System Architecture

# 📦 Ecommerce Clean Architecture Project

## 🧱 Project Structure
```
com.FawryRise.Journey
├── model/
│   ├── Customer.java
│   ├── Cart.java
│   └── ProductInCart.java
│
├── payment/
│   ├── PaymentInterface.java
│   └── PseudoPayment.java
│
├── product/
│   ├── DigitalProduct.java
│   ├── ExpirableProductInterface.java
│   ├── Shippable.java
│   └── ShippableProduct.java
│
├── shipping/
│   ├── ExpressShipping.java
│   ├── PseudoShipping.java
│   ├── ShippingStrategy.java
│   └── StandardShipping.java
│
├── observer/
│   ├── EmailNotification.java
│   ├── OrderObserver.java
│   ├── OrderSubject.java
│   └── SMSNotification.java
│
└── service/
    └── (Service classes)
```

## ✅ Highlights
- **SOLID Principles** are applied.
- **Clean Architecture** layers: `domain`, `application`, `infrastructure`, `presentation`.
- Supports expirable and shippable product logic.
- Includes console-based shipping and checkout simulation.
- JUnit tests included for core functionality.
