package com.effective.java.factory.pattern;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(final String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else
        {
            return null;
        }
    }
}