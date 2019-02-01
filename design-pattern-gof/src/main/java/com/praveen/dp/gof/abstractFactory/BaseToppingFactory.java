package com.praveen.dp.gof.abstractFactory;

import com.praveen.dp.gof.abstractFactory.topping.Cheese;
import com.praveen.dp.gof.abstractFactory.topping.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
