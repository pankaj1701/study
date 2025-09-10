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
    protected Object clone() throws CloneNotSupportedException {
        StudentDetailsDeep s = (StudentDetailsDeep) super.clone();
        s.address = (AddressDeep) address.clone(); // clone inner object too
        return s;
    }
}
