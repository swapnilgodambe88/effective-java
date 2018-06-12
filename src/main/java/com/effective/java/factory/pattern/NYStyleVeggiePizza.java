package com.effective.java.factory.pattern;

public class NYStyleVeggiePizza extends Pizza
{

    public NYStyleVeggiePizza()
    {
        name = "NY Style Veggie Pizza";
        dough = new ThinCrustDough();
        sauce = new MarinaraSauce();

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
