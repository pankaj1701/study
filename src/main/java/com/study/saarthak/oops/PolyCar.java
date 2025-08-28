package com.study.saarthak.oops;

public class PolyCar extends PolyVehicle {
    @Override
    public void move(){
        System.out.println("The car is moving");
    }

    public static void main(String[] args) {
        PolyCar car = new PolyCar();
        car.move();
    }
}
