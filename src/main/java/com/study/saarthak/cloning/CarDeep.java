package com.study.saarthak.cloning;

import com.study.saarthak.oops.Car;

public class CarDeep implements Cloneable {
    String model;
    EngineDeep engineDeep;
    CarDeep (){};
    CarDeep(String model, EngineDeep engineDeep) {
        this.model = model;
        this.engineDeep = engineDeep;
    }
    public CarDeep deepClone(){
        //return new CarDeep(this.model, this.engineDeep.deepClone());
        CarDeep c3 = new CarDeep();
        c3.model = this.model;
        c3.engineDeep = this.engineDeep.deepClone();
        return c3;
    }
}
