package com.syscho.pattern.behavioral.state.vpn;

public class DisConnectedState implements VpnState {
    @Override
    public void perform() {
        System.out.println("DisConnected from VPN");
    }
}
