package com.syscho.pattern.behavioral.observer.observer;

public class EmailObserver implements Observer {
    private String name;

    public EmailObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String email) {
        sendSMS(email);
    }

    private void sendSMS(String email) {
        System.out.println("Sending EMAIl to " + name + " with email id" + email);

    }
}
