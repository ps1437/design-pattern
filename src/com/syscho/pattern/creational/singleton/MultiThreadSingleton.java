package com.syscho.pattern.creational.singleton;

public class MultiThreadSingleton {
    private MultiThreadSingleton() {
    }

    private static MultiThreadSingleton singleBean = null;

    public static MultiThreadSingleton getInstance() {
        if (null == singleBean) { // lazy initialization
            synchronized (MultiThreadSingleton.class) {
                if (null == singleBean) {
                    singleBean = new MultiThreadSingleton();
                }
            }

        }
        return singleBean;
    }

}
