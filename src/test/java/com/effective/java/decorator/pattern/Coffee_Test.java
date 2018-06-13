package com.effective.java.decorator.pattern;

import org.junit.Assert;
import org.junit.Test;

/**
 * White box test testing the Decorator pattern.
 * 
 * @author Swapnil
 *
 */
public class Coffee_Test
{
    private final static double DELTA = 0.00001;

    /**
     * Verifies the cost and description are populated properly with the decorator
     * pattern
     */
    @Test
    public void testEspresso_costAndDescription()
    {
        final Beverage beverage = new Espresso();

        final String expectedDescription = "Espresso";
        Assert.assertEquals("Assert failure on description", expectedDescription, beverage.getDescription());

        final double expectedCost = CoffeeIngredientCost.ESPRESSO.getCost();
        Assert.assertEquals("Assertion failure on cost", expectedCost, beverage.cost(), DELTA);
    }

    /**
     * Verifies the cost and description are populated properly with the decorator
     * pattern
     */
    @Test
    public void testDarkRoast_costAndDescription()
    {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        final String expectedDescription = "Dark Roast Coffee, Mocha, Mocha, Whip";
        Assert.assertEquals("Assert failure on description", expectedDescription, beverage.getDescription());

        final double expectedCost = CoffeeIngredientCost.DARK_ROAST.getCost() + CoffeeIngredientCost.MOCHA.getCost() + CoffeeIngredientCost.MOCHA.getCost() + CoffeeIngredientCost.WHIP.getCost();
        Assert.assertEquals("Assertion failure on cost", expectedCost, beverage.cost(), DELTA);
    }

    /**
     * Verifies the cost and description are populated properly with the decorator
     * pattern
     */
    @Test
    public void testHouseBlend_costAndDescription()
    {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        final String expectedDescription = "House Blend Coffee, Soy, Mocha, Whip";
        Assert.assertEquals("Assert failure on description", expectedDescription, beverage.getDescription());

        final double expectedCost = CoffeeIngredientCost.HOUSE_BLEND.getCost() + CoffeeIngredientCost.SOY.getCost() + CoffeeIngredientCost.MOCHA.getCost() + CoffeeIngredientCost.WHIP.getCost();
        Assert.assertEquals("Assertion failure on cost", expectedCost, beverage.cost(), DELTA);
    }
}
