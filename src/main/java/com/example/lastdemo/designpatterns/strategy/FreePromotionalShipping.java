package com.example.lastdemo.designpatterns.strategy;

import com.example.lastdemo.ShippingCostStrategy;

public class FreePromotionalShipping implements shippingCostStrategy {
    @Override
    public int calculateShippingCost(Order order) {
        return 0;
    }
}
