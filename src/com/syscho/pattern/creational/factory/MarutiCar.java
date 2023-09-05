package com.syscho.pattern.creational.factory;

public class MarutiCar implements Car {
    @Override
    public int cost() {
        return 1000;
    }

    @Override
    public String engineType() {
        return "MRT-Super";
    }

    @Override
    public String color() {
        return "green";
    }
}
