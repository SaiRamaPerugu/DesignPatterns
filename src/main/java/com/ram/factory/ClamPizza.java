package com.ram.factory;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory =   ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare:" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        clams = ingredientFactory.createClams();
        cheese = ingredientFactory.createCheese();
    }
}
