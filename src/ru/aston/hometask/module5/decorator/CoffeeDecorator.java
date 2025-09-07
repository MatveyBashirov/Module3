package ru.aston.hometask.module5.decorator;

public class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public  CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getIngridients() {
        return decoratedCoffee.getIngridients();
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }
}
