package com.syscho.pattern.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    //SingletonHelper will be loaded when getInstance() cvalled
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}