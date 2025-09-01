package com.study.saarthak.practicestaticfinal;

public class Counter {
    static int count;
    public Counter(){
        count++;
        System.out.println("count:"+count);
    }

    public static void main(String[] args) {
        Counter count1 = new Counter();
        Counter count2 = new Counter();
        Counter count3 = new Counter();
        Counter count4 = new Counter();
        Maths.square(4);
    }
}
