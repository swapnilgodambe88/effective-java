package com.effective.java.decorator.pattern;

public class HouseBlend extends Beverage
{
    public HouseBlend()
    {
        description = "House Blend Coffee";
    }

    @Override
    public double cost()
    {
        return CoffeeIngredientCost.HOUSE_BLEND.getCost();
    }
}
