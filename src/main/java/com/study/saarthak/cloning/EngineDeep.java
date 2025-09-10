package com.study.saarthak.cloning;

public class EngineDeep implements Cloneable{
    int horsepower;
    EngineDeep(int horsepower){
        this.horsepower=horsepower;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
