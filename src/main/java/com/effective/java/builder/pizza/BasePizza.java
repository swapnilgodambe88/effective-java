package com.effective.java.builder.pizza;

import java.util.Objects;

import com.effective.java.builder.pizza.enums.PizzaCrust;
import com.effective.java.builder.pizza.enums.PizzaTopping;
import com.google.common.collect.ImmutableSet;

/**
 * Class representing a basic pizza
 *
 * @author Swapnil
 *
 */
public abstract class BasePizza
{
    private final ImmutableSet<PizzaTopping> pizzaToppings;
    private final PizzaCrust pizzaCrust;

    /**
     * @return A list of {@link PizzaTopping} added on the pizza (can be empty).
     */
    public final ImmutableSet<PizzaTopping> getPizzaToppings()
    {
        return pizzaToppings;
    }

    /**
     * @return The non-null {@link PizzaCrust} of the pizza
     */
    public final PizzaCrust getPizzaCrust()
    {
        return pizzaCrust;
    }

    public abstract static class Builder<T extends Builder<T>>
    {
        private final ImmutableSet.Builder<PizzaTopping> pizzaToppingsBuilder;
        private final PizzaCrust pizzaCrust;

        /**
         * Private constructor for Builder.
         *
         * @param pizzaCrust
         *            The {@link PizzaCrust} for the pizza (cannot be null).
         * @throws NullPointerException
         *             If any of the parameter conditions are not met.
         */
        protected Builder(final PizzaCrust pizzaCrust)
        {
            this.pizzaCrust = Objects.requireNonNull(pizzaCrust);
            this.pizzaToppingsBuilder = ImmutableSet.builder();
        }

        /**
         * @param pizzaTopping
         *            The {@link PizzaTopping} to be added to the pizza (cannot be
         *            null);
         * @return T.
         * @throws NullPointerException
         *             If any of the parameter conditions are not met.
         */
        public T withTopping(final PizzaTopping pizzaTopping)
        {
            pizzaToppingsBuilder.add(Objects.requireNonNull(pizzaTopping, () -> "pizzaTopping: null"));
            return self();
        }

        /**
         * Abstract implementation of returning the builder.
         *
         * @return T.
         */
        protected abstract T self();

        /**
         * Abstract implementation of the build method. Classes extending this can add
         * validation (if required).
         *
         * @return The {@link BasePizza} object.
         */
        protected abstract BasePizza build();

    };

    protected BasePizza(Builder<?> builder)
    {
        this.pizzaToppings = builder.pizzaToppingsBuilder.build();
        this.pizzaCrust = builder.pizzaCrust;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString()
    {
        return new StringBuilder(200).append(" pizzaToppings=").append(pizzaToppings).append(", pizzaCrust=").append(pizzaCrust).toString();
    }
}
