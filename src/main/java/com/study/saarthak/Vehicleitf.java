package com.study.saarthak;

public interface Vehicleitf {
    int getAcceleration();
    int getMaxSpeed();
    default void printEngineDetails(){
        System.out.println("You are inside Vehicle interface");

    }

}

