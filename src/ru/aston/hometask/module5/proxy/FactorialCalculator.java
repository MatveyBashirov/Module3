package ru.aston.hometask.module5.proxy;

public class FactorialCalculator implements FactorialClass{
    @Override
    public int calculateFactorial(int a) {
        System.out.println("Расчет факториала для числа" + a);
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
