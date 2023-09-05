package com.syscho.pattern.creational.prototype;

import com.syscho.pattern.creational.prototype.model.Actor;
import com.syscho.pattern.creational.prototype.model.AddressType;

public class ProtoMain {
    public static void main(String[] args) {

        Actor actor = new Actor();
        actor.setAge(1);
        actor.setName("praveen");
        AddressType addressType = new AddressType();
        addressType.setAddressCode("abc");
        addressType.setCity("hyd");
        addressType.setState("TL");
        addressType.setPostalCode("5002");
        actor.setAddressType(addressType);

        System.out.println(actor);

        Actor clone = actor.clone();

        System.out.println(clone);

    }
}
