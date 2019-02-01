package com.praveen.dp.gof.abstractFactory;


import com.praveen.dp.gof.abstractFactory.product.Pizza;

public abstract class BasePizzaFactory {
    
    public abstract Pizza createPizza(String type);
}
