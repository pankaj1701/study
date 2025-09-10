package com.study.saarthak.exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();   // enter text instead
            System.out.println("Number = " + n);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only!");
        }
    }
}