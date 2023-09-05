package com.syscho;

class A {
    String name = "praveen";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class workT {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("executed gc");
    }

    public static void main(String[] args) throws InterruptedException {

        A a = new A();
        a.setName("Kirab");
        System.out.println(a);

        a = null;
        System.out.println(a);


        System.gc();
        System.out.println("))))))))))))))))))))))))))))))))");
    }
}
