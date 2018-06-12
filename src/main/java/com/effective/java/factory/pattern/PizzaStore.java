package com.effective.java.factory.pattern;

public abstract class PizzaStore {

    abstract Pizza createPizza(String item);

    public Pizza orderPizza(final String type) {
        final Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
