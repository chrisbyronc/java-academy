package com.pluralsight;

public class Person {
    private double height;
    private String name;
    private int age;

    public Person(double height, String name, int age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
