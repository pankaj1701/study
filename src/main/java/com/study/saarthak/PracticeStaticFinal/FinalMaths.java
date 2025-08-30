package com.study.saarthak.PracticeStaticFinal;

public class FinalMaths {
    final double pi= 3.14;
    public void areaOfCircle(int radius){
        System.out.println("Area of Circle is: "+radius*radius*pi);
    }

    public static void main(String[] args) {
        FinalMaths f=new FinalMaths();
        f.areaOfCircle(5);
    }

}
