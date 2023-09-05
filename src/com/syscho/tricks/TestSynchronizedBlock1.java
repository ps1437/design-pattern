package com.syscho.tricks;

class Table {
    void printTable(int n) {
        synchronized (this) {//synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }//end of the method
}


public class TestSynchronizedBlock1 {
    public static void main(String args[]) {
        Table obj = new Table();//only one object

        new Thread(() -> obj.printTable(5)).start();
        new Thread(() -> obj.printTable(100)).start();

    }
}    