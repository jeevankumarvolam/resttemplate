package com.example.lastdemo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscribeService extends Product{


    public void addSubscriber(Product product, StockLevelObserver stockLevelObserver) {

        product.getObserverList().add(stockLevelObserver);
    }

    public void removeSubscriber(Product product, StockLevelObserver stockLevelObserver) {

        product.getObserverList().remove(stockLevelObserver);
    }

    @Override
    public int getAbstractMethod() {
        return 0;
    }

//    public Product getCloneOfProduct(Product product){
//
//        Product product1=new Product();
//
//        product1.setStockLevel(product.getStockLevel());
//
//        product1.setProductName(product.getProductName());
//
//        List<StockLevelObserver> stockLevelObserverList=new ArrayList<>();
//
//       return product1;
//    }

}
