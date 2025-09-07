package ru.aston.hometask.module5.strategy;

public class Sum implements CalculationStrategy{
    @Override
    public int calculation(int a, int b) {
        return a+b;
    }
}
