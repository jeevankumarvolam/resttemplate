package com.example.lastdemo.designpatterns.strategy;

public class ProviderBasedShipping implements shippingCostStrategy{

    @Override
    public int calculateShippingCost(Order order) {
        return 0;
    }
}
