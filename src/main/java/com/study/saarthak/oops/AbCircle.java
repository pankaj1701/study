package com.study.saarthak.oops;

public class AbCircle extends AbShape {
    int radius=1;
    public void area(){
        System.out.println("Area of Circle: "+(3.14)*(radius*radius));
    }

    public static void main(String[] args) {
        AbCircle Circle = new AbCircle();
        Circle.area();
    }
}
