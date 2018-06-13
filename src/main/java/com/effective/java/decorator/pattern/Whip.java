package com.effective.java.decorator.pattern;

public class Whip extends CondimentDecorator
{
    Beverage beverage;

    public Whip(final Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost()
    {
        return CoffeeIngredientCost.WHIP.getCost() + beverage.cost();
    }
}
