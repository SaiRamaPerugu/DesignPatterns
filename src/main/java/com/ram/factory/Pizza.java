package com.ram.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings:");
        for(String topping: toppings) {
            System.out.println(topping);
        }
    }

    public void bake() {
        System.out.println("Baking pizza at 350F");
    }

    public void cut() {
        System.out.println("Cutting pizza into pieces");
    }

    public void box() {
        System.out.println("Place the pizza in the box.");
    }

    public String getName() {
        return name;
    }
}
