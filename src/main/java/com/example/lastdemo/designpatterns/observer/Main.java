package com.example.lastdemo.designpatterns.observer;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        SubscribeService subscribeService = new SubscribeService();
        StockLevelObserver stockLevelObserver=new Cache();
        Product product=new Product();
        subscribeService.addSubscriber(product,stockLevelObserver);
        product.setStockLevel(30);
        product.clone();

    }
}
