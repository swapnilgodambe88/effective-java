package com.effective.java.decorator.pattern;

public class Decaf extends Beverage
{
    public Decaf()
    {
        description = "Decaf Coffee";
    }

    @Override
    public double cost()
    {
        return CoffeeIngredientCost.DECAF.getCost();
    }
}
