package com.effective.java.decorator.pattern;

public class Soy extends CondimentDecorator
{
    Beverage beverage;

    public Soy(final Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost()
    {
        return CoffeeIngredientCost.SOY.getCost() + beverage.cost();
    }
}
