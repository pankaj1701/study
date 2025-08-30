package com.study.saarthak.PracticeStaticFinal;

public class counter {
    static int count;
    public counter(){
        count++;
        System.out.println("count:"+count);
    }

    public static void main(String[] args) {
        counter count1 = new counter();
        counter count2 = new counter();
        counter count3 = new counter();
        counter count4 = new counter();
    }
}
