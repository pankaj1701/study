package com.study.saarthak.immutableclass;

final class ImmutableCar {
    private final String model;
    private final int horsepower;

    public ImmutableCar(String model, int horsepower) {
        this.model = model;
        this.horsepower = horsepower;
    }
    public String getModel() {
        return model;
    }
    public int getHorsepower(){
        return horsepower;
    }
    public ImmutableCar withHorsepower(int newHorsepower){
        return new ImmutableCar(this.model,newHorsepower);
    }
    public ImmutableCar withModel(String newModel){
        return new ImmutableCar(newModel,this.horsepower);
    }
}
