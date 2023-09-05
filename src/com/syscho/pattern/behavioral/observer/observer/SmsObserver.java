package com.syscho.pattern.behavioral.observer.observer;

public class SmsObserver implements Observer {

    private String name;

    public SmsObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String email) {
        sendSMS(email);
    }

    private void sendSMS(String email) {
        System.out.println("Sending SMS to " + name + " with email id" + email);
    }
}
