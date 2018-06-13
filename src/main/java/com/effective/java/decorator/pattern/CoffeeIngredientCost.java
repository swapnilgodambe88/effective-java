package com.effective.java.decorator.pattern;

/**
 * An Enumeration representing the cost of individual ingredients of a coffee.
 * 
 * @author Swapnil
 */
public enum CoffeeIngredientCost
{
    DARK_ROAST(.99), DECAF(1.05), ESPRESSO(1.99), HOUSE_BLEND(0.89), MILK(10), MOCHA(0.20), SOY(0.15), WHIP(0.10);

    private double cost = .99;

    /**
     * Constructor for CostConstant. Declared private to prevent direct
     * instantiation.
     * 
     * @param cost
     *            The cost associated to the coffee ingredient.
     */
    private CoffeeIngredientCost(final double cost)
    {
        this.cost = cost;
    }

    /**
     * @return The cost associated to the coffee ingredient.
     */
    final public double getCost()
    {
        return cost;
    }
}
