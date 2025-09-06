package com.example.lastdemo.designpatterns.strategy;

public class WeightedShipping implements shippingCostStrategy{
    @Override
    public int calculateShippingCost(Order order) {
        return 0;
    }
}
