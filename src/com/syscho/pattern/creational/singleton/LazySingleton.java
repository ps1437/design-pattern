package com.syscho.pattern.creational.singleton;

public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton singleBean = null;

    public static LazySingleton getInstance() {
        if (null == singleBean) { // lazy initialization
            singleBean = new LazySingleton();
        }
        return singleBean;
    }

}
