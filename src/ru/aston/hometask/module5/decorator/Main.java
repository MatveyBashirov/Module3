package ru.aston.hometask.module5.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Ваш кофе с " + espresso.getIngridients() + " / Цена: " + espresso.getPrice());

        Coffee americano = new Americano(new Espresso());
        System.out.println("Ваш кофе с " + americano.getIngridients() + " / Цена: " + americano.getPrice());
    }
}
