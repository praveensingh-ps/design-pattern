package com.praveen.dp.gof.abstractFactory;

import com.praveen.dp.gof.abstractFactory.topping.Cheese;
import com.praveen.dp.gof.abstractFactory.topping.MozzarellaCheese;
import com.praveen.dp.gof.abstractFactory.topping.Sauce;
import com.praveen.dp.gof.abstractFactory.topping.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory{
    @Override
    public  Cheese createCheese(){return new MozzarellaCheese();}
    @Override
    public  Sauce createSauce(){return new TomatoSauce();}
}
