package com.study.saarthak.oops;

import java.awt.*;

public class Abrectangle extends AbShape {
    int height=25;
    int width=25;
    public void area() {
        System.out.println("Area of rectangle: "+height*width);
    }

    public static void main(String[] args) {
        Abrectangle rectangle=new Abrectangle();
        rectangle.area();

    }
}
