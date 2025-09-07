package ru.aston.hometask.module5.builder;

public class SportBuilder implements CarBuilder{
    private String engine;
    private String color;
    private String wheels;

    @Override
    public CarBuilder setEngine() {
        this.engine = "Sport Engine";
        return this;
    }

    @Override
    public CarBuilder setWheels() {
        this.wheels = "Sport Wheels";
        return this;
    }

    @Override
    public CarBuilder paintCar() {
        this.color = "Sport Paint";
        return this;
    }

    @Override
    public Car build() {
        return new Car(engine,wheels,color);
    }
}
