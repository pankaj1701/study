package com.study.saarthak.cloning;

public class EngineDeep implements Cloneable{
    int horsepower;
    EngineDeep(int horsepower){
        this.horsepower=horsepower;
    }
    public EngineDeep deepClone(){
        return new EngineDeep(this.horsepower);
    }
}
