package com.syscho.pattern.behavioral.strategy;

//https://www.freecodecamp.org/news/a-beginners-guide-to-the-strategy-design-pattern/
public class Main {

    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPaymentStrategy());

        paymentProcessor.processPayment(500);

        paymentProcessor = new PaymentProcessor(new DebitCardPaymentStrategy());

        paymentProcessor.processPayment(500);

    }
}
