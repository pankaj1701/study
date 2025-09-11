package com.study.saarthak.cloning;

public class StudentDetailsDeep implements Cloneable {
    int id;
    String name;
    AddressDeep address;

    StudentDetailsDeep(int id, String name, AddressDeep address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Deep clone for Student
    public StudentDetailsDeep deepClone(){
        return new StudentDetailsDeep(this.id, this.name, this.address.deepClone());
    }
}
