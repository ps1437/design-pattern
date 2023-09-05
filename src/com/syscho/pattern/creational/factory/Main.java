package com.syscho.pattern.creational.factory;

public class Main {

    public static void main(String[] args) {
        System.out.println(CarFactory.getCar(new SportCar()).engineType());
        System.out.println(CarFactory.getCar(new BMWCar()).engineType());
        System.out.println(CarFactory.getCar(new MarutiCar()).engineType());
    }
}
