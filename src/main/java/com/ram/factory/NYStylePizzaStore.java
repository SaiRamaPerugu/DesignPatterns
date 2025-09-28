package com.ram.factory;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza() {
        Pizza pizza = new NYStylePizza();

        return pizza;
    }


}
