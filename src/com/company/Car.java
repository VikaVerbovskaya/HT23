package com.company;

public abstract class Car {

    public String model;
    public double speed;
    public String color;

    public String gas(int g) {
        return "gas:"+g;
    }

    public String brake(int b) {
        return "brake:"+b;
    }

    public abstract String description();
}
