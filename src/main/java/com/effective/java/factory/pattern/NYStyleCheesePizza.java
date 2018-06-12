package com.effective.java.factory.pattern;

public class NYStyleCheesePizza extends Pizza
{

    public NYStyleCheesePizza()
    {
        name = "NY Style Sauce and Cheese Pizza";
        dough = new ThickCrustDough();
        sauce = new MarinaraSauce();

        toppings.add("Grated Reggiano Cheese");
    }
}
