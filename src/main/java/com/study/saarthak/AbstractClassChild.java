package com.study.saarthak;

public class AbstractClassChild  extends AbstractClassTest{
    public void printTest2(){
        System.out.println("Inside AbstractClassChild");
    }
    public void printTest3(){
        System.out.println("Inside AbstractClassChild");
    }

    public static void main(String[] args) {
        AbstractClassTest at=new AbstractClassChild();
        at.printTest2();
        at.printTest();


    }
}
