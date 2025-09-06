package com.example.lastdemo.designpatterns.observer;

public class SubscribeService {


    public void addSubscriber(Product product, StockLevelObserver stockLevelObserver) {

        product.getObserverList().add(stockLevelObserver);
    }

    public void removeSubscriber(Product product, StockLevelObserver stockLevelObserver) {

        product.getObserverList().remove(stockLevelObserver);
    }
}
