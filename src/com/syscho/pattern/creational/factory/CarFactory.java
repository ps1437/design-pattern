package com.syscho.pattern.creational.factory;

public class CarFactory {

    public static Car getCar(Car car) {
        if (car instanceof SportCar) {
            return new SportCar();
        }
        if (car instanceof MarutiCar) {
            return new MarutiCar();
        }
        if (car instanceof BMWCar) {
            return new BMWCar();
        }

        throw new IllegalStateException("not found");
    }
}
