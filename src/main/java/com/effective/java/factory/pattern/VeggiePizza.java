package com.effective.java.factory.pattern;

public class VeggiePizza extends Pizza
{
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(final PizzaIngredientFactory ingredientFactory)
    {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare()
    {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
