package com.syscho.pattern.creational.singleton;

import java.io.Serializable;

public class SerilizationSingleton implements Serializable {
    private SerilizationSingleton() {
    }

    private static SerilizationSingleton singleBean = null;

    public static SerilizationSingleton getInstance() {
        if (null == singleBean) {
            singleBean = new SerilizationSingleton();
        }


        return singleBean;
    }

    //Serialization -deserilization safe
    protected Object readResolve() {
        return getInstance();
    }

}
