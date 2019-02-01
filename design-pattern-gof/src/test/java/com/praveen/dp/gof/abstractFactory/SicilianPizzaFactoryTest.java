package com.praveen.dp.gof.abstractFactory;

import org.junit.Test;

import com.praveen.dp.gof.abstractFactory.BasePizzaFactory;
import com.praveen.dp.gof.abstractFactory.SicilianPizzaFactory;
import com.praveen.dp.gof.abstractFactory.product.Pizza;

public class SicilianPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        Pizza cheesePizza=pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");
    }
}