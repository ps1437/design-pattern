package com.syscho.pattern.creational.factory;

public class BMWCar implements Car {
    @Override
    public int cost() {
        return 5000;
    }

    @Override
    public String engineType() {
        return "BWM-Super";
    }

    @Override
    public String color() {
        return "yellow";
    }
}
