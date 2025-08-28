package com.study.saarthak.oops;

public class AbCurrentAccount extends AbAccount{
    private Double balance=1000.0;
    public void deposit(int money) {
        balance+=money;
    }
    public void withdraw(int money) {
        balance-=money;
    }

    public static void main(String[] args) {
        AbCurrentAccount a1=new AbCurrentAccount();
        a1.deposit(100);
        System.out.println("Your balance:"+a1.balance);
        a1.withdraw(100);
        System.out.println("Your balance:"+a1.balance);
    }
}
