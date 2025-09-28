package com.ram.factory;

public class ChicagoStylePizza extends Pizza {

    public ChicagoStylePizza() {
        dough = "Extra thick Crust Dough";
        sauce = "Plum tomcato source";
        name = "Chicago Style Deep Dish Pizza";
        toppings.add("Cheese");
        toppings.add("Basil");
    }

    public void bake() {
        System.out.println("Bake in Chicago Style Pizza");
    }

    public void cut() {
        System.out.println("Cut pizza to square pieces");
    }
}
