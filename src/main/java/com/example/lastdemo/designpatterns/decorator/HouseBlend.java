package com.example.lastdemo.designpatterns.decorator;

public class HouseBlend implements Beverage{
    @Override
    public double cost() {
        return 500;
    }

    @Override
    public String getDescription() {
        return "HouseBlend,";
    }
}
