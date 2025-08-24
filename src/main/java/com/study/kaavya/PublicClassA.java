package com.study.kaavya;

import com.study.saarthak.PublicClassB;

public class PublicClassA {
    public PublicClassA() {}
    public PublicClassA(String test1, String test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    protected String getTest() {
        return test;
    }

    protected void setTest(String test) {
        this.test = test;
    }

    protected String test;

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    private String test1;
      private String test2;

      public void printValues(){
          System.out.println("Value of test1 is "+test1);
          System.out.println("Value of test2 is "+test2);
      }

    public static void main(String[] args) {
        PublicClassA ref1 = new PublicClassA();
        ref1.setTest1("ABC");
        ref1.setTest2("DEF");
        ref1.printValues();
        PublicClassA ref2 = new PublicClassA("ABC", "DEF");
        ref2.printValues();
        PublicClassA ref3;
        ref3 = ref2;
        ref3.printValues();
        ref3 = new PublicClassA("PQR", "STU");
        ref3.printValues();


    }

}
