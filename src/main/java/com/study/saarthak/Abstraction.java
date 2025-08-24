package com.study.saarthak;
abstract class Vehicle{
    abstract void start();
    void stop(){
        System.out.println("Vehicle stopped");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("car starts with a key");
    }
}
class bike extends Vehicle{
    void start(){
        System.out.println("bike starts with a key");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Vehicle v1=new Car();
        v1.start();
        v1.stop();
        Vehicle v2=new bike();
        v2.start();
    }
}
