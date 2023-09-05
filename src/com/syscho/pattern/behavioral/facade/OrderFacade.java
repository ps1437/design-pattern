package com.syscho.pattern.behavioral.facade;

public class OrderFacade {

    void createOrder() {
        //getUSerIndo

        // can do api call and other method calls
        System.out.println("getting user info");
        //Make Payament
        System.out.println("checking user account balance");
        //creatae order
        System.out.println("Placing an order");
        //send notification
        System.out.println("Order placed successfully with id 1234");

    }
}
