package ru.aston.hometask.module5.proxy;

public class Main {
    public static void main(String[] args) {
        FactorialClass proxy = new FactorialProxy();
        System.out.println("Факториал 5: " + proxy.calculateFactorial(5));
        System.out.println("-----------------");
        System.out.println("Факториал 5: " + proxy.calculateFactorial(5));
    }
}
