package com.effective.java.builder.pizza;

import java.util.Objects;

import com.effective.java.builder.pizza.enums.PizzaCrust;
import com.effective.java.builder.pizza.enums.PizzaCut;
import com.effective.java.builder.pizza.enums.PizzaSauce;
import com.effective.java.builder.pizza.enums.PizzaSize;

/**
 * Papa John's implementation of Base pizza.
 *
 * @author Swapnil
 *
 */
public class PapaJohnsPizza extends BasePizza
{
    private final PizzaSize pizzaSize;
    private final boolean addGarlicSauce;
    private final PizzaCut pizzaCut;
    private final PizzaSauce pizzaSauce;

    /**
     * @return The size of the pizza.
     */
    public final PizzaSize getPizzaSize()
    {
        return pizzaSize;
    }

    /**
     * @return True if garlic sauce is required on the side.
     */
    public final boolean garlicSauceAdded()
    {
        return addGarlicSauce;
    }

    /**
     * @return The {@link PizzaCut} for the pizza.
     */
    public final PizzaCut getPizzaCut()
    {
        return pizzaCut;
    }

    /**
     * @return The {@link PizzaSauce} for the pizza.
     */
    public final PizzaSauce getPizzaSauce()
    {
        return pizzaSauce;
    }

    /**
     * The Builder for {@link PapaJohnsPizza}.
     *
     * @author Swapnil
     */
    public static class Builder extends BasePizza.Builder<Builder>
    {
        private final PizzaSize pizzaSize;
        private boolean addGarlicSauce;
        private PizzaCut pizzaCut;
        private PizzaSauce pizzaSauce;

        /**
         * Public constructor for the PapaJohnsPizza.
         *
         * @param pizzaCrust
         *            The {@link PizzaCrust} for the pizza (cannot be null).
         * @param pizzaSize
         *            The {@link PizzaSauce} for the pizza (cannot be null).
         * @throws NullPointerException
         *             If any of the parameter conditions are not met.
         */
        public Builder(final PizzaCrust pizzaCrust, final PizzaSize pizzaSize)
        {
            super(Objects.requireNonNull(pizzaCrust, "pizzaCrust: null"));
            this.pizzaSize = Objects.requireNonNull(pizzaSize, "pizzaSize: null");
            defaultValues();
        }

        /**
         * The default values for the pizza, if not provided by the consumer of this
         * builder pattern.
         */
        private final void defaultValues()
        {
            this.addGarlicSauce = false;
            this.pizzaCut = PizzaCut.NORMAL;
            this.pizzaSauce = PizzaSauce.ORIGINAL;
        }

        /**
         * Set the garlic sauce required on the side = true.
         *
         * @return A non-null Builder.
         */
        public Builder withGarlicSauce()
        {
            this.addGarlicSauce = true;
            return self();
        }

        /**
         * @param pizzaCut
         *            The {@link PizzaCut} for the pizza (cannot be null).
         * @return A non-null Builder.
         * @throws NullPointerException
         *             If any of the parameter conditions are not met.
         */
        public Builder withPizzaCut(final PizzaCut pizzaCut)
        {
            this.pizzaCut = Objects.requireNonNull(pizzaCut, "pizzaCut: null");
            return self();
        }

        /**
         * @param pizzaCut
         *            The {@link PizzaSauce} for the pizza (cannot be null).
         * @return A non-null Builder.
         * @throws NullPointerException
         *             If any of the parameter conditions are not met.
         */
        public Builder withPizzaSauce(final PizzaSauce pizzaSauce)
        {
            this.pizzaSauce = Objects.requireNonNull(pizzaSauce, () -> "pizzaSauce: null");
            return self();
        }

        /**
         * Declared private to prevent direct instantiation.
         */
        private Builder()
        {
            super(null);
            this.pizzaSize = null;
            defaultValues();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        protected Builder self()
        {
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public PapaJohnsPizza build()
        {
            return new PapaJohnsPizza(self());
        }
    };

    /**
     * Constructor declared private to prevent direct instantiation.
     *
     * @param builder
     */
    private PapaJohnsPizza(final Builder builder)
    {
        super(builder);
        pizzaSize = builder.pizzaSize;
        addGarlicSauce = builder.addGarlicSauce;
        pizzaCut = builder.pizzaCut;
        pizzaSauce = builder.pizzaSauce;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString()
    {
        final String baseToString = super.toString();

        return new StringBuilder(200).append("PapaJohnsPizza = ").append("[").append(baseToString).append(", pizzaSize=").append(pizzaSize).append(", addGarlicSauce=").append(addGarlicSauce)
                .append(", pizzaCut=").append(pizzaCut).append(", pizzaSauce=").append(pizzaSauce).append("]").toString();
    }
}
