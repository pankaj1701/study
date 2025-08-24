package com.study.saarthak;

public class VehicleTest  {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        System.out.println(v1.getAcceleration());
        System.out.println(v1.getMaxSpeed());
        System.out.println(v1.offRoadingCapacity());
        v1.printEngineDetails();
    }
}
