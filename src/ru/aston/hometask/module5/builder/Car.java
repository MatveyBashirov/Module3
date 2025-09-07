package ru.aston.hometask.module5.builder;

public class Car {
    private String engine;
    private String color;
    private String wheels;

    public Car(String engine, String wheels, String color) {
        this.engine = engine;
        this.color = color;
        this.wheels = wheels;
    }

    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
    }
}
