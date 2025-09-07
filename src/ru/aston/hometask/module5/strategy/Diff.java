package ru.aston.hometask.module5.strategy;

public class Diff implements CalculationStrategy{
    @Override
    public int calculation(int a, int b) {
        return a-b;
    }
}
