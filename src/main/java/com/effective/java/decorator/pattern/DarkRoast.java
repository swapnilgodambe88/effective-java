package com.effective.java.decorator.pattern;

public class DarkRoast extends Beverage
{
    public DarkRoast()
    {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost()
    {
        return CoffeeIngredientCost.DARK_ROAST.getCost();
    }
}
