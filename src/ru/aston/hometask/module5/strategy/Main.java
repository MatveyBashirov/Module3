package ru.aston.hometask.module5.strategy;

public class Main {
    public static void main(String[] args) {
        int firstOperand = 3;
        int secondOperand = 2;

        Sum sumStrategy = new Sum();
        Diff diffStrategy = new Diff();
        Calculator calculator = new Calculator();

        calculator.setChoosenStrategy(sumStrategy);
        int result = calculator.doCalculation(firstOperand, secondOperand);
        System.out.println("Результат операции сложения: " + result);
        calculator.setChoosenStrategy(diffStrategy);
        result = calculator.doCalculation(firstOperand, secondOperand);
        System.out.println("Результатоперации вычитания: " + result);
    }
}
