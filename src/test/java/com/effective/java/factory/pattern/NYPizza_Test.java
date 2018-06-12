package com.effective.java.factory.pattern;

import org.junit.Assert;
import org.junit.Test;

public class NYPizza_Test
{
    final PizzaStore getNyPizzaStore()
    {
        return new NYPizzaStore();
    }

    /**
     * Verifies the NY style Pizza creation for cheese pizza.
     */
    @Test
    public void testNYPizzaCreation_orderCheesePizza()
    {
        final PizzaStore nyStore = getNyPizzaStore();

        final Pizza pizza = nyStore.orderPizza("cheese");

        final String expectedPizzaName = "NY Style Sauce and Cheese Pizza";
        Assert.assertEquals(expectedPizzaName, pizza.getName());
    }

    /**
     * Verifies the NY style Pizza creation for clam pizza.
     */
    @Test
    public void testNYPizzaCreation_orderClamPizza()
    {
        final PizzaStore nyStore = getNyPizzaStore();

        final Pizza pizza = nyStore.orderPizza("clam");

        final String expectedPizzaName = "NY Style Clam Pizza";
        Assert.assertEquals(expectedPizzaName, pizza.getName());
    }

    /**
     * Verifies the NY style Pizza creation for pepperoni pizza.
     */
    @Test
    public void testNYPizzaCreation_orderPepperoniPizza()
    {
        final PizzaStore nyStore = getNyPizzaStore();

        final Pizza pizza = nyStore.orderPizza("pepperoni");

        final String expectedPizzaName = "NY Style Pepperoni Pizza";
        Assert.assertEquals(expectedPizzaName, pizza.getName());
    }
}
