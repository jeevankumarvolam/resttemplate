package com.example.lastdemo.designpatterns.decorator;

public abstract class CondimentDecorator implements Beverage {

    protected Beverage beverage;

    public abstract String getDescription();


}
