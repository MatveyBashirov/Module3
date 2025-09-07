package ru.aston.hometask.module5.builder;

public class RegularBuilder implements CarBuilder {
    private String engine;
    private String color;
    private String wheels;

    @Override
    public CarBuilder setEngine() {
        this.engine = "Regular Engine";
        return this;
    }

    @Override
    public CarBuilder setWheels() {
        this.wheels = "Regular Wheels";
        return this;
    }

    @Override
    public CarBuilder paintCar() {
        this.color = "Regular Paint";
        return this;
    }

    @Override
    public Car build() {
        return new Car(engine,wheels,color);
    }
}
