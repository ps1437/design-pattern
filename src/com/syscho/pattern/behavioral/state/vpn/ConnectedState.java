package com.syscho.pattern.behavioral.state.vpn;

public class ConnectedState implements VpnState{
    @Override
    public void perform() {
        System.out.println("Connected to VPN");
    }
}
