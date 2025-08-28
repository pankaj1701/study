package com.study.saarthak;

import java.util.Scanner;

public class PrintPrimeNo {
    static boolean isPrime(int num){
        if(num<2){
            return false;
        }if(num==2){
            return true;
        }
        if(num%2==0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(num);i+=2){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number");
        int n = sc.nextInt();
        int num=1;
        int count=0;
        int prime=2;
        long startTime=System.currentTimeMillis();
        while(count<n){
            num++;
            if(isPrime(num)){
                count++;
                prime=num;
            }
        }
        System.out.println(n+" Prime no. is "+prime);
        long endTime=System.currentTimeMillis();
        System.out.println("Total time take to calculate is "+(endTime-startTime));

    }
}
