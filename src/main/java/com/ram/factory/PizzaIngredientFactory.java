package com.ram.factory;

public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
    Sauce createSauce();
    Clams createClams();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
}
