package com.study.saarthak.cloning;

public class AddressDeep implements Cloneable {
    String city;
    String state;

    AddressDeep(String city, String state) {
        this.city = city;
        this.state = state;
    }


    public AddressDeep deepClone(){
        return new AddressDeep(this.city , this.state);
    }
}
