package com.syscho.pattern.creational.factory;

public class SportCar implements Car {
    @Override
    public int cost() {
        return 10000;
    }

    @Override
    public String engineType() {
        return "Sport-Super";
    }

    @Override
    public String color() {
        return "RED";
    }
}
