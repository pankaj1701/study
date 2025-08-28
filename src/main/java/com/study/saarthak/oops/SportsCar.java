package com.study.saarthak.oops;

public class SportsCar extends Car {
    @Override
    public void printSpec() {
        System.out.println("4 wheel drive");
        System.out.println("6 gears");
        System.out.println("Advanced Headlights");
    }
    public void printTest(int a, int b){
        System.out.println(a+b);
    }
    public void printTest(){
        System.out.println("4 wheel drive");
        System.out.println("6 gears");
    }
    public void printTest(String a, String b){
        System.out.println(a+b);
    }
    public void printCarSpec(Car a){
        a.printSpec();
    }

    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.printTest(23,24);
        car.printTest("Apple","Banana");
        car.printTest();
        car.printSpec();

        Car car2 = new Car();
        Car car3 = new SportsCar();
        car2.printSpec();
        car3.printSpec();
        System.out.println("-------");
        SportsCar car4 = new SportsCar();
        car4.printCarSpec(new Car());
        car4.printCarSpec(new SportsCar());
    }
}
