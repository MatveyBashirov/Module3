package ru.aston.hometask.module5.adapter;

public class Main {
    public static void main(String[] args) {
        FahrenheitSensor sensor = new FahrenheitSensor();
        CelsiusTermometr adapter = new FahrenheitToCelsiusAdapter(sensor);
        System.out.println("Температура в Цельсиях: " + adapter.getTempereature());
    }
}
