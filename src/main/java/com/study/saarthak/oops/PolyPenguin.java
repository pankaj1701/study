package com.study.saarthak.oops;

public class PolyPenguin extends PolyFly{
    @Override
    public void fly(){
        System.out.println("This Bird cannot Fly");
    }

    public static void main(String[] args) {
        PolyPenguin penguin = new PolyPenguin();
        penguin.fly();
    }
}
