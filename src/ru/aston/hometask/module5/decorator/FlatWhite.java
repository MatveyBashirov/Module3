package ru.aston.hometask.module5.decorator;

public class FlatWhite extends CoffeeDecorator {
    public FlatWhite(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getIngridients() {
        return super.getIngridients() + ", Milk";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 45.0;
    }
}
