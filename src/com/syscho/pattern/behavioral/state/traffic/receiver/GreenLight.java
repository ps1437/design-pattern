package com.syscho.pattern.behavioral.state.traffic.receiver;

public class GreenLight implements Reciever{
    @Override
    public void on() {
        System.out.println("Switching on Green light");

    }

    @Override
    public void off() {
        System.out.println("Switching off Green light");

    }
}
