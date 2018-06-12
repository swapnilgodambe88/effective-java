package com.effective.java.factory.pattern;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory
{

    @Override
    public Dough createDough()
    {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce()
    {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese()
    {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies()
    {
        final Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }
}
