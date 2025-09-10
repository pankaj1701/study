package com.study.saarthak.cloning;

public class StudentCloneShallow implements Cloneable {
    int id;
    String name;

    StudentCloneShallow(int id, String name) {
        this.id = id;
        this.name = name;
    }


    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
