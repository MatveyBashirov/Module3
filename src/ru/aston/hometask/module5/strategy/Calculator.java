package ru.aston.hometask.module5.strategy;

public class Calculator {
    private CalculationStrategy choosenStrategy;

    public void setChoosenStrategy(CalculationStrategy choosenStrategy) {
        this.choosenStrategy = choosenStrategy;
    }

    public int doCalculation(int a, int b){
        return choosenStrategy.calculation(a,b);
    }
}
