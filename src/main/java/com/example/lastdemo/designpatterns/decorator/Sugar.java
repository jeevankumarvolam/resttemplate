package com.example.lastdemo.designpatterns.decorator;

public class Sugar extends CondimentDecorator{

    public Sugar(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        System.out.println("In sugar cost");
        return beverage.cost()+600;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Sugar";
    }
}
