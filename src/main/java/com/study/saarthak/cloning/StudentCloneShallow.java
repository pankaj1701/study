package com.study.saarthak.cloning;

public class StudentCloneShallow implements Cloneable {
    int id;
    String name;

    StudentCloneShallow(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public StudentCloneShallow shallowClone(){
        return new StudentCloneShallow(this.id, this.name);
    }
}
