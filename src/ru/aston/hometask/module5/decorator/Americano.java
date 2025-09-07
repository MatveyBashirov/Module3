package ru.aston.hometask.module5.decorator;

public class Americano extends CoffeeDecorator{
    public Americano(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getIngridients() {
        return super.getIngridients() + ", Water";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 30.0;
    }
}
