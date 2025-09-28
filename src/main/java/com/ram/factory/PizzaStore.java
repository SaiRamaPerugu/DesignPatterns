package com.ram.factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        return createPizza(type);
    }

    abstract Pizza createPizza(String item);
}
