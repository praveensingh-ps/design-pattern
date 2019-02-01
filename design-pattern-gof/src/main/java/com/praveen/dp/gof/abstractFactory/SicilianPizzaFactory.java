package com.praveen.dp.gof.abstractFactory;


import com.praveen.dp.gof.abstractFactory.product.CheesePizza;
import com.praveen.dp.gof.abstractFactory.product.PepperoniPizza;
import com.praveen.dp.gof.abstractFactory.product.Pizza;
import com.praveen.dp.gof.abstractFactory.product.VeggiePizza;

public class SicilianPizzaFactory extends BasePizzaFactory {

    @Override
    public  Pizza createPizza(String type){
        Pizza pizza;
       BaseToppingFactory toppingFactory= new SicilianToppingFactory();
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
