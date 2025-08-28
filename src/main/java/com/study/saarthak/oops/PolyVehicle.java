package com.study.saarthak.oops;

public class PolyVehicle {
    public void move(){
        System.out.println("Vehicle is moving");
    }

    public static void main(String[] args) {
        PolyVehicle vehicle = new PolyVehicle();
        vehicle.move();
    }
}
