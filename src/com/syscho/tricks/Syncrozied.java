package com.syscho.tricks;

public class Syncrozied {
    public static void main(String[] args) {
        Apple apple = new Apple();

        Thread thread = new Thread(() -> {
            try {
                apple.methodOne();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.setName("Thread-1");
        thread.start();
        Thread thread1 = new Thread(() -> {
            try {
                apple.methodTwo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.setName("Thread-2");
        thread1.start();
        new Thread(() -> {
            try {
                apple.methodTwo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                apple.methodTwo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                apple.methodThree();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

class Apple {

    synchronized void methodOne() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Method one executed by " + Thread.currentThread().getName());
        System.out.println("OUTSIDE...........");
    }

    void methodTwo() throws InterruptedException {
        System.out.println("Method two executed by " + Thread.currentThread().getName());
    }

    synchronized void methodThree() throws InterruptedException {
        System.out.println("Method Threee executed by " + Thread.currentThread().getName());
    }
}
