package com.effective.java.decorator.pattern;

public class Espresso extends Beverage
{

    public Espresso()
    {
        description = "Espresso";
    }

    @Override
    public double cost()
    {
        return CoffeeIngredientCost.ESPRESSO.getCost();
    }
}
