package com.effective.java.factory.pattern;

public class NYStyleClamPizza extends Pizza
{

    public NYStyleClamPizza()
    {
        name = "NY Style Clam Pizza";
        dough = new ThinCrustDough();
        sauce = new MarinaraSauce();

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
