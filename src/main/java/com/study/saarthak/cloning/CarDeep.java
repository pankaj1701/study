package com.study.saarthak.cloning;

public class CarDeep implements Cloneable {
    String model;
    EngineDeep engineDeep;
    CarDeep(String model, EngineDeep engineDeep) {
        this.model = model;
        this.engineDeep = engineDeep;
    }
    public CarDeep deepClone(){
        return new CarDeep(this.model, this.engineDeep.deepClone());
    }
}
