package com.example.lastdemo.designpatterns.strategy;

public class Main {

    public static void main(String[] args) {

        BeanProvideService beanProvideService = new BeanProvideService();
        ShippingCalculator shippingCalculator=new ShippingCalculator();
        Order order = new Order();
        order.setShippingType("free");
        shippingCostStrategy ShippingCostStrategy=beanProvideService.getBeanMap().get(order.getShippingType());
        shippingCalculator.calculateShippingCost(order,ShippingCostStrategy);


    }
}
