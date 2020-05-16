package com.company;

public class Main {

    public static void main(String[] args) {
        MyCar reno = new MyCar("reno logan", 85.7, "red");
        System.out.println(reno.gas(34));
        System.out.println(reno.brake(80));
        System.out.println(reno.description());

        HisCar bmw = new HisCar("bmw e34", 95.7, "grey");
        System.out.println(bmw.gas(40));
        System.out.println(bmw.brake(80));
        System.out.println(bmw.description());
    }
}
