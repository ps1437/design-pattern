package com.syscho.pattern.creational.prototype.model;

import com.syscho.pattern.creational.prototype.Prototype;

public class Actor implements Prototype {
    private String name;
    private int age;

    private AddressType addressType;

    public String getName() {
        return name;
    }

    public Actor(String name, int age, AddressType addressType) {
        this.name = name;
        this.age = age;
        this.addressType = addressType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public Actor() {
    }

    @Override
    public Actor clone() {
        return new Actor(name, age, addressType);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addressType=" + addressType +
                '}';
    }
}
