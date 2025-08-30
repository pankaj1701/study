package com.study.saarthak.Interface;

public class VehicleClass implements VehicleFeature1 , VehicleFeature2 , VehicleFeature3 {
    public void engineCapacity(String engineCapacity) {
        System.out.println("Engine Capacity :" + engineCapacity);
    }
    public void speed(int speed) {
        System.out.println("Speed(in km/h) :" + speed);
    }
    public void acceleration(int acceleration) {
        System.out.println("Acceleration(in km/h) :" + acceleration);
    }

    public static void main(String[] args) {
        VehicleClass v = new VehicleClass();
        v.speed(80);
        v.engineCapacity("3 liter");
        v.acceleration(10);
    }

}
