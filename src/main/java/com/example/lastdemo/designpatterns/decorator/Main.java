package com.example.lastdemo.designpatterns.decorator;



public class Main {
    public static void main(String[] args) {
       /*
        here to avoid continous recursion or to stop calling cost method
        once it reaches the base item
        base items implemented the cost method differently and the add on's
        to make sure both call same cost method
        since beverage reference to be holded by all subclasses it is kept as
        abstract class
        */

        Beverage espresso=new Espresso();
        espresso=new Milk(espresso);
        espresso=new Sugar(espresso);
        System.out.println("The cost is "+espresso.cost());
        System.out.println("The description is "+espresso.getDescription());

    }
}
