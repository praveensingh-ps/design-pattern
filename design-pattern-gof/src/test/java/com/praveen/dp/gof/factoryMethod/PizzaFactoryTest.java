package com.praveen.dp.gof.factoryMethod;

import org.junit.Test;

import com.praveen.dp.gof.factoryMethod.BasePizzaFactory;
import com.praveen.dp.gof.factoryMethod.Pizza;
import com.praveen.dp.gof.factoryMethod.PizzaFactory;

public class PizzaFactoryTest {
    @Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}
