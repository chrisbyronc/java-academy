package com.pluralsight;

public class Car {

    private String manufacturer, model;

    private int speed;

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
