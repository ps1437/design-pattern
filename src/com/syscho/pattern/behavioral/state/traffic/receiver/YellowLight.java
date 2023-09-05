package com.syscho.pattern.behavioral.state.traffic.receiver;

public class YellowLight implements Reciever{
    @Override
    public void on() {
        System.out.println("Switching on Yellow light");

    }

    @Override
    public void off() {
        System.out.println("Switching off Yellow light");

    }
}
