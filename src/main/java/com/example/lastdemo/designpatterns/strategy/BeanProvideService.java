package com.example.lastdemo.designpatterns.strategy;

import java.util.HashMap;


public class BeanProvideService {


    private HashMap<String, shippingCostStrategy> beanMap = new HashMap<>();

    public BeanProvideService() {
        beanMap.put("free", new FreePromotionalShipping());
        beanMap.put("provider", new ProviderBasedShipping());
        beanMap.put("weighted", new WeightedShipping());
    }

    public HashMap<String, shippingCostStrategy> getBeanMap() {
        return beanMap;
    }

    public void setBeanMap(HashMap<String, shippingCostStrategy> beanMap) {
        this.beanMap = beanMap;
    }


}
