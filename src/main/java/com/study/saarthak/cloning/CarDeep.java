package com.study.saarthak.cloning;

public class CarDeep implements Cloneable {
    String model;
    EngineDeep engineDeep;
    CarDeep(String model, EngineDeep engineDeep) {
        this.model = model;
        this.engineDeep = engineDeep;
    }
    protected Object clone() throws CloneNotSupportedException {
        CarDeep c = (CarDeep) super.clone();
        c.engineDeep = (EngineDeep) this.engineDeep.clone();
        return c;
    }
}
