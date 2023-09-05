package com.syscho.pattern.behavioral.state.traffic.receiver;

public class RedLight implements Reciever{
    @Override
    public void on() {
        System.out.println("Switching on RED light");

    }

    @Override
    public void off() {
        System.out.println("Switching off RED light");

    }
}
