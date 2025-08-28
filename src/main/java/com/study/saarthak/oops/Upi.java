package com.study.saarthak.oops;

import java.util.Scanner;

public class Upi implements Payment {
    private String upino;
    public void setUpino(String upino){
        this.upino = upino;
    }
    public String getUpino(){
        return upino;
    }
    public void pay(){
        System.out.println("Your Upi Number is: "+upino);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Upi Number");
        String upino = sc.nextLine();
        Upi upi = new Upi();
        upi.setUpino(upino);
        upi.pay();
    }
}
