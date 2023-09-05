package com.syscho.pattern.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Singleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        SerilizationSingletonTest();

    }


    private static void SerilizationSingletonTest() throws IOException, ClassNotFoundException {

        BillPughSingleton instanceOne = BillPughSingleton.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("t.obj"));

        objectOutputStream.writeObject(instanceOne);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("t.obj"));

        BillPughSingleton instanceTwo = (BillPughSingleton) objectInputStream.readObject();
        System.out.println(instanceTwo == instanceOne);
        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

    }

}
