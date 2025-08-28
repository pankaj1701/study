package com.study.saarthak.oops;

public class Calculator {

    public void sub(int a, int b){
        System.out.println("Subtraction= " +(a+b));
    }
    public void sub(double a, double b){
        System.out.println("Subtraction= "+(a+b));
    }
    public void sub(float a, float b){
        System.out.println("Subtraction= "+(a+b));
    }
    public void sub(long a, long b){
        System.out.println("Subtraction= "+(a+b));
    }
    public void add(int a,int b){
        System.out.println("Addition= "+(a+b));
    }
    public void add(double a,double b){
        System.out.println("Addition= "+(a+b));
    }
    public void add(float a,float b){
        System.out.println("Addition= "+(a+b));
    }
    public void add(long a,long b){
        System.out.println("Addition= "+(a+b));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sub(10,20);
        calculator.sub(10.0,20.0);
        calculator.add(10,20);
        calculator.add(10.0,20.0);


    }
}
