package com.example.lastdemo.designpatterns.decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
        this.beverage=beverage;

    }

    @Override
    public double cost() {
        System.out.println("In Milk cost");
        return beverage.cost()+1200;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Milk";
    }
}
