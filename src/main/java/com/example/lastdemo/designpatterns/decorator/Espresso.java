package com.example.lastdemo.designpatterns.decorator;

public class Espresso implements Beverage {

    @Override
    public double cost() {
        System.out.println("In Espresso cost ");
        return 300;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
