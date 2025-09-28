package com.ram.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[]  veggies;
    Pepperoni pepperoni;
    Cheese cheese;
    Clams clams;

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings:");
        for(Veggies veggi: veggies) {
            System.out.println(veggi);
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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", pepperoni=" + pepperoni +
                ", cheese=" + cheese +
                ", clams=" + clams +
                '}';
    }
}
