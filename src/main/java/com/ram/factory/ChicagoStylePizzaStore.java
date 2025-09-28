package com.ram.factory;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza() {
        Pizza pizza = new ChicagoStylePizza();
        return pizza;
    }
}
