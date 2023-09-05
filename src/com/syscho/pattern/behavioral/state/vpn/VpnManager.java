package com.syscho.pattern.behavioral.state.vpn;

public class VpnManager {

    private VpnState state;

    void setState(VpnState state) {
        this.state = state;
    }

    void perform() {
        state.perform();
    }
}
