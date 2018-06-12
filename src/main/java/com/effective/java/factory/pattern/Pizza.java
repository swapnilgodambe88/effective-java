package com.effective.java.factory.pattern;

import java.util.ArrayList;

/**
 * An abstract class defining the base pizza. The extending classes are
 * responsible for providing the name, dough, sauce and toppings.
 *
 * @author Swapnil
 */
public abstract class Pizza
{
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    ArrayList<String> toppings = new ArrayList<String>();

    /**
     * Prepares the Pizza
     */
    void prepare()
    {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");

        for (final String topping : toppings)
        {
            System.out.println("   " + topping);
        }

        System.out.println("Adding cheese..");
    }

    /**
     * Bakes the Pizza.
     */
    void bake()
    {
        System.out.println("Bake for 25 minutes at 350");
    }

    /**
     * Cuts the Pizza.
     */
    void cut()
    {
        System.out.println("Cut the pizza into diagonal slices");
    }

    /**
     * Box the Pizza
     */
    void box()
    {
        System.out.println("Place pizza in official PizzaStore box");
    }

    /**
     * @return The name for the Pizza
     */
    public String getName()
    {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString()
    {
        final StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (final String topping : toppings)
        {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
