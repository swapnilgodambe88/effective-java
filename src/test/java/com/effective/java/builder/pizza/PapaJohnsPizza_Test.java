package com.effective.java.builder.pizza;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.effective.java.builder.pizza.enums.PizzaCrust;
import com.effective.java.builder.pizza.enums.PizzaSize;
import com.effective.java.builder.pizza.enums.PizzaTopping;
import com.google.common.collect.ImmutableSet;

public class PapaJohnsPizza_Test
{
    /**
     * Expected exception thrown by the individual test.
     */
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /**
     * Verifies null-pointer exception is thrown if pizzaCrust is null.
     */
    @Test
    public void testBuilder_nullPizzaCrust()
    {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("pizzaCrust: null");

        @SuppressWarnings("unused")
        final PapaJohnsPizza pizza = new PapaJohnsPizza.Builder(null, PizzaSize.PERSONAL).build();
    }

    /**
     * Verifies null-pointer exception is thrown if pizzaSize is null.
     */
    @Test
    public void testBuilder_nullPizzaSize()
    {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("pizzaSize: null");

        @SuppressWarnings("unused")
        final PapaJohnsPizza pizza = new PapaJohnsPizza.Builder(PizzaCrust.NORMAL, null).build();
    }

    /**
     * Verifies builder appropriately sets the PizzaCrust and PizzaSize for the Pizza.
     */
    @Test
    public void testBuilder_validPizzaCrust()
    {
        final PapaJohnsPizza pizza = new PapaJohnsPizza.Builder(PizzaCrust.NORMAL, PizzaSize.PERSONAL).build();
        Assert.assertEquals(pizza.getPizzaCrust(), PizzaCrust.NORMAL);
        Assert.assertEquals(pizza.getPizzaSize(), PizzaSize.PERSONAL);
    }

    /**
     * Verifies null-pointer exception is thrown if topping is null.
     */
    @Test
    public void testBuilder_nullToppings()
    {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("pizzaTopping: null");

        @SuppressWarnings("unused")
        final PapaJohnsPizza pizza = new PapaJohnsPizza.Builder(PizzaCrust.NORMAL, PizzaSize.MEDIUM).withTopping(null).build();
    }

    /**
     * Verifies builder appropriately sets the PizzaTopping for the Pizza.
     */
    @Test
    public void testBuilder_validTopping()
    {
        final PapaJohnsPizza pizza = new PapaJohnsPizza.Builder(PizzaCrust.NORMAL, PizzaSize.PERSONAL).withTopping(PizzaTopping.CHEESE).build();
        Assert.assertEquals(pizza.getPizzaToppings(), ImmutableSet.of(PizzaTopping.CHEESE));
    }

}
