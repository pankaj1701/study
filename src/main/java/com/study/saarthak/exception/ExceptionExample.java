package com.study.saarthak.exception;

/**
 * keywords:try catch finally throw throws
 *
 */
public class ExceptionExample {
    public static void divide(int a,int b){
        System.out.println("divide: "+(a/b));
    }
    public static boolean checkAge(int age) throws Exception,IllegalArgumentException{
        if(age<18){
            throw new IllegalArgumentException("Age cannot be less than 18");
        }
        else if(age>60){
            System.out.println("Age is greater than 60");
            throw new Exception("Age cannot be more than 60");
        }
        else {
            System.out.println("Age is valid "+age);
            return true;
        }
    }
    public static void main(String[] args) {
        //divide(4,2);
        //divide(4,0);
        String s[]=new String[5];
        s[0]="a";
        s[1]="b";
        s[2]="c";
        s[3]="d";
        s[4]="e";
        //System.out.println(s[0]+s[1]+s[5]);

        try {
            checkAge(30);
            checkAge(18);
            try {
                checkAge(12);
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }
            checkAge(19);
            checkAge(70);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
