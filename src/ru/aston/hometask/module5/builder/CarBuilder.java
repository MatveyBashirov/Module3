package ru.aston.hometask.module5.builder;

public interface CarBuilder {
    CarBuilder setEngine();
    CarBuilder setWheels();
    CarBuilder paintCar();
    Car build();
}
