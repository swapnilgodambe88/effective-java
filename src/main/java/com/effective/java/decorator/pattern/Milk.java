package com.effective.java.decorator.pattern;

public class Milk extends CondimentDecorator
{
    Beverage beverage;

    public Milk(final Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost()
    {
        return CoffeeIngredientCost.MILK.getCost() + beverage.cost();
    }
}
