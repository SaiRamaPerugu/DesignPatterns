package com.ram.factory;

public class PizzaMain {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        Pizza nyPizza = nyPizzaStore.createPizza();
        nyPizza.prepare();
        nyPizza.bake();
        nyPizza.cut();
        nyPizza.box();
        nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan order " + nyPizza.getName());
        Pizza chicagoPizza = chicagoPizzaStore.createPizza();
        chicagoPizza.prepare();
        chicagoPizza.bake();
        chicagoPizza.cut();
        chicagoPizza.box();
        chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel order " + chicagoPizza.getName());

    }
}
