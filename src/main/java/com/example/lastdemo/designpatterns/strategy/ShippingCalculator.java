package com.example.lastdemo.designpatterns.strategy;

public class ShippingCalculator {

    public int calculateShippingCost(Order order,shippingCostStrategy ShippingCostStrategy){


        return ShippingCostStrategy.calculateShippingCost(order);

    }

}
