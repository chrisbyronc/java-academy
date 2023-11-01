package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @org.junit.jupiter.api.Test
    void accelerate_should_increaseCarSpeed() {
        Car testCar = new Car("McLaren", "GT");

        int speed = 100;

        int expectedSpeed = 100;

        testCar.accelerate(speed);

        int actualSpeed = testCar.getSpeed();

        assertEquals(expectedSpeed, actualSpeed);
    }


    @Test
    void accelerate() {
    }

    @Test
    void getSpeed() {
    }
}