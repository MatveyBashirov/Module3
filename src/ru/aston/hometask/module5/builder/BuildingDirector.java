package ru.aston.hometask.module5.builder;

public class BuildingDirector {
    private CarBuilder carBuilder;

    public BuildingDirector(CarBuilder builder) {
        this.carBuilder = builder;
    }

    public Car carBuilding() {
        return carBuilder.setEngine().setWheels().paintCar().build();
    }
}
