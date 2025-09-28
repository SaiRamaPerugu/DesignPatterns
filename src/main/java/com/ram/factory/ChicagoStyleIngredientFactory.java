package com.ram.factory;

public class ChicagoStyleIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new EggPlant(), new BlackOlives(), new Spinach()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
