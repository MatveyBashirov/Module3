package ru.aston.hometask.module5.builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new RegularBuilder();
        BuildingDirector director = new BuildingDirector(builder);
        Car car = director.carBuilding();
        System.out.println(car);
    }
}
