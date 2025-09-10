package com.study.saarthak.exception;

public class IllegalArgumentEx {
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age set to " + age);
    }

    public static void main(String[] args) {
        try {
            setAge(-5);   // invalid input
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}