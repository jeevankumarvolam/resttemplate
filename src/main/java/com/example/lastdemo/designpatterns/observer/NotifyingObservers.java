package com.example.lastdemo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NotifyingObservers {
    public static void notifyObservers(Product product) {
        for(StockLevelObserver observer:product.getObserverList()){




        }
    }
}
