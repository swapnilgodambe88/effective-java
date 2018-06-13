package com.effective.java.decorator.pattern;

public class Mocha extends CondimentDecorator
{
    Beverage beverage;

    public Mocha(final Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost()
    {
        return CoffeeIngredientCost.MOCHA.getCost() + beverage.cost();
    }
}
