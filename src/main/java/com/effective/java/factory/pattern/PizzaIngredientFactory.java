package com.effective.java.factory.pattern;

public interface PizzaIngredientFactory
{

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

}
