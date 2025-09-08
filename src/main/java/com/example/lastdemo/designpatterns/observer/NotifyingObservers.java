package com.example.lastdemo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NotifyingObservers  extends  Product{

    private  final SubscribeService subscribeService;

    public NotifyingObservers(SubscribeService subscribeService) {
        this.subscribeService = subscribeService;
    }


    public static void notifyObservers(Product product) {
        for(StockLevelObserver observer:product.getObserverList()){




        }
    }
}
