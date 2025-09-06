package com.example.lastdemo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private int stockLevel;

    private List<StockLevelObserver> observerList = new ArrayList<>();
    private String productName;

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
        NotifyingObservers.notifyObservers(this);
    }

    public List<StockLevelObserver> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<StockLevelObserver> observerList) {
        this.observerList = observerList;
    }

    public void addToObserversList(StockLevelObserver stockLevelObserver) {

        this.observerList.add(stockLevelObserver);
    }

    public void removeFromObserversList(StockLevelObserver stockLevelObserver) {
        this.observerList.remove(stockLevelObserver);

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
