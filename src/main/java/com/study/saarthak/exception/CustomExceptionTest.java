package com.study.saarthak.exception;

public class CustomExceptionTest {
    public static void throwCkeckedException () throws CheckedException{
        System.out.println("Checked Exception throw");
        throw new CheckedException("My first checked exception");
    }
    public static void throwUncheckedException() {
        System.out.println("Unchecked Exception throw");
        throw new UnCheckedException("My first unchecked exception");
    }
    public static void main(String[] args) {
        try{
            CustomExceptionTest.throwUncheckedException();
        }catch (UnCheckedException e){
            System.out.println("Unchecked Exception throw");
        }
        try{
            CustomExceptionTest.throwUncheckedException();
        }catch (UnCheckedException f){
            System.out.println("Unchecked Exception throw");
        }
        try{
            CustomExceptionTest.throwCkeckedException();

        }catch (CheckedException e){
            System.out.println("Ckecked Exception throw");
        }
    }
}
