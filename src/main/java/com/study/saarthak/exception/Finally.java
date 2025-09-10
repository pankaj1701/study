package com.study.saarthak.exception;

public class Finally {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Exception caught");
            try{
                int data=50/0;
            }
            catch(ArithmeticException f){
                System.out.println("Exception caught");
            }
        } finally {
            System.out.println("Finally block always executes");
            try{
                int data=50/0;
            }
            catch(ArithmeticException e){
                System.out.println("Exception caught");
            }
        }
    }
}
