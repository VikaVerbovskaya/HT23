package com.company;

public class HisCar implements CarInterface {
    public String model;
    public double speed;
    public String color;

    public HisCar(String m, double s, String c) {
        model = m;
        speed = s;
        color = c;
    }

    @Override
    public String gas(int g) {
        return "gas:" + g;
    }

    @Override
    public String brake(int b) {
        return "brake:" + b;
    }

    @Override
    public String description() {
        return "model:" + model + " / speed:" + speed + " / color:" + color;
    }
}
