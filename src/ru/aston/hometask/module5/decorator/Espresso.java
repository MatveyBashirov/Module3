package ru.aston.hometask.module5.decorator;

public class Espresso implements Coffee{
    @Override
    public String getIngridients() {
        return "Espresso";
    }

    @Override
    public double getPrice() {
        return 180.0;
    }
}
