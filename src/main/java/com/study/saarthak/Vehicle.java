package com.study.saarthak;

public class Vehicle implements Vehicleitf,HeavyVehicleItf {

    @Override
    public int getAcceleration() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }
    @Override
    public boolean offRoadingCapacity() {
        return false;
    }



}

