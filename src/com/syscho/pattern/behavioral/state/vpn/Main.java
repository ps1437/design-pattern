package com.syscho.pattern.behavioral.state.vpn;

public class Main {

    public static void main(String[] args) {
        VpnManager vpnManager = new VpnManager();

        VpnState connectState = new ConnectedState();
        VpnState disconnectState = new DisConnectedState();

        vpnManager.setState(connectState);
        vpnManager.perform();

        vpnManager.setState(disconnectState);
        vpnManager.perform();
    }
}