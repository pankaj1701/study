package com.study.saarthak.oops;

public class PolyBike extends PolyVehicle {
    @Override
    public void move(){
        System.out.println("Bike is moving");
    }

    public static void main(String[] args) {
        PolyBike bike = new PolyBike();
        bike.move();
    }
}
