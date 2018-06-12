package com.effective.java.factory.pattern;

public class NYStylePepperoniPizza extends Pizza
{

    public NYStylePepperoniPizza()
    {
        name = "NY Style Pepperoni Pizza";
        dough = new ThinCrustDough();
        sauce = new MarinaraSauce();

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
