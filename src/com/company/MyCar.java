package com.company;

public class MyCar extends Car {

    public MyCar(String m, double s, String c) {
        model = m;
        speed = s;
        color = c;
    }

    @Override
    public String description() {
        return "model:" + model + " / speed:" + speed + " / color:" + color;
    }
}
