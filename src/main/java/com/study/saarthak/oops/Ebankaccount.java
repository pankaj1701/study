package com.study.saarthak.oops;

public class Ebankaccount {
    private int balance=10000;

    public void deposit(int amount){
        balance+=amount;
        System.out.println("Your new balance is "+balance);
    }
    public void withdraw(int amount){
        if(balance<amount){
            System.out.println("Insufficient balance");
        }else{
            balance-=amount;
            System.out.println("Your new balance is "+balance);
        }
    }
    public void getBalance() {
        System.out.println("Your current balance is "+balance);
    }

    public static void main(String[] args) {
        Ebankaccount account=new Ebankaccount();
        account.deposit(10000);
        account.withdraw(5000);
        account.getBalance();
    }
}
