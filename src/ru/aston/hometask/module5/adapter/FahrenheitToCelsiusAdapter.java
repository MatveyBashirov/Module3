package ru.aston.hometask.module5.adapter;

public class FahrenheitToCelsiusAdapter implements CelsiusTermometr {
    private FahrenheitSensor sensor;

    public FahrenheitToCelsiusAdapter(FahrenheitSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTempereature() {
        double fahrenheit = sensor.getFahrenheitTemperature();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Преобразование из Фаренгейтов в Цельсий");
        return celsius;
    }
}
