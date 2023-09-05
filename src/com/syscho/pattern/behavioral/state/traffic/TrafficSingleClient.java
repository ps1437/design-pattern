package com.syscho.pattern.behavioral.state.traffic;

//https://timepasstechies.com/state-design-pattern-java-real-world-example/
public class TrafficSingleClient {

    public static void main(String[] args) throws InterruptedException {
        TrafficSystem trafficSystem = new TrafficSystem();
        while (true) {
            trafficSystem.displayState();
            if (trafficSystem.getCurrentState() instanceof Yellow) {
                Thread.sleep(1000);
            } else {
                Thread.sleep(5000);
            }
            trafficSystem.changeState();
        }
    }
}