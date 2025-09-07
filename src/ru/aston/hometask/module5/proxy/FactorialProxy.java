package ru.aston.hometask.module5.proxy;

import java.util.HashMap;

public class FactorialProxy implements FactorialClass {
    private final FactorialCalculator realObject = new FactorialCalculator();;
    private final HashMap<Integer, Integer> cache = new HashMap<>();

    @Override
    public int calculateFactorial(int a) {
        if (cache.containsKey(a)) {
            System.out.println("Получение факториала из кэша для " + a);
            return cache.get(a);
        } else {
            int result = realObject.calculateFactorial(a);
            cache.put(a, result);
            return result;
        }
    }
}
