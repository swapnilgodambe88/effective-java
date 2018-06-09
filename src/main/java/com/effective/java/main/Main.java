package com.effective.java.main;

import com.effective.java.builder.pizza.BasePizza;
import com.effective.java.builder.pizza.PapaJohnsPizza;
import com.effective.java.builder.pizza.enums.PizzaCrust;
import com.effective.java.builder.pizza.enums.PizzaSize;
import com.effective.java.builder.pizza.enums.PizzaTopping;

/**
 * Main Class for executing individual functionality.
 *
 * @note Add private methods for individual workflows.
 * @author Swapnil
 *
 */
public class Main
{
    public static void main(final String args[])
    {
        BasePizzaTesting();
    }

    /**
     * To test {@link BasePizza} and {@link PapaJohnsPizza} implementations.
     */
    private static void BasePizzaTesting()
    {
        final PapaJohnsPizza pizza = new PapaJohnsPizza.Builder(PizzaCrust.PAN_CRUST, PizzaSize.PERSONAL)
                .withTopping(PizzaTopping.CHEESE)
                .withTopping(PizzaTopping.BELL_PEPPER)
                .withTopping(PizzaTopping.CORN)
                .withTopping(PizzaTopping.ONION)
                .withTopping(PizzaTopping.GARLIC)
                .withGarlicSauce()
                .build();

        System.out.println(pizza);
    }
}
