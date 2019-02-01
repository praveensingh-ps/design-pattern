package com.praveen.dp.gof.abstractFactory;

import com.praveen.dp.gof.abstractFactory.topping.CaliforniaOilSauce;
import com.praveen.dp.gof.abstractFactory.topping.Cheese;
import com.praveen.dp.gof.abstractFactory.topping.GoatCheese;
import com.praveen.dp.gof.abstractFactory.topping.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese(){return new GoatCheese();}
    @Override
    public Sauce createSauce(){return new CaliforniaOilSauce();}
}
