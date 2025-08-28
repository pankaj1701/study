package com.study.saarthak.oops;

import java.util.Scanner;

public class CreditCard implements Payment{
    private String cardNumber;
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public void pay() {
        System.out.println("Payment Card Number: " + cardNumber);
    }

    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Card Number ");
        String cardNumber = sc.nextLine();
        card.setCardNumber(cardNumber);
        card.pay();
    }
}
