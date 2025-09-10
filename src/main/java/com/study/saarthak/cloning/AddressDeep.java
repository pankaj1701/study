package com.study.saarthak.cloning;

public class AddressDeep implements Cloneable {
    String city;
    String state;

    AddressDeep(String city, String state) {
        this.city = city;
        this.state = state;
    }


    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
