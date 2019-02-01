package com.praveen.dp.gof.abstractFactory;

import org.junit.Test;

import com.praveen.dp.gof.abstractFactory.BasePizzaFactory;
import com.praveen.dp.gof.abstractFactory.GourmetPizzaFactory;
import com.praveen.dp.gof.abstractFactory.product.Pizza;

public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
    BasePizzaFactory pizzaFactory=new GourmetPizzaFactory();
        Pizza cheesePizza= pizzaFactory.createPizza("cheese");
        Pizza veggiePizza=pizzaFactory.createPizza("veggie");
    }
}