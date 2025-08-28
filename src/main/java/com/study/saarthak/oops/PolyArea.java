package com.study.saarthak.oops;

public class PolyArea {
    public void area(int lenght,int breath){
        System.out.println("Area of rectangle= "+(lenght*breath));
    }
    public void area(int radius){
        System.out.println("Area of circle= "+(3.14)*(radius*radius));
    }

    public static void main(String[] args) {
        PolyArea area = new PolyArea();
        area.area(1,2);
        area.area(1);
    }
}
