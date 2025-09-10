package com.study.saarthak.immutableclass;
import java.util.*;
public class Immutable {
    public static void main(String[] args) {
        ImmutableStudent s1= new ImmutableStudent(101,"Saarthak");
        System.out.println("Name "+s1.getName());
        System.out.println("Id "+s1.getId());

        List<String> ch = new ArrayList<>();
        ch.add("Indroduction to Java");
        ch.add("Basics of Java");
        ImmutableBook b1 = new ImmutableBook("A programmers guide to java","Mughal Khalid",ch);
        ch.add("OOPS");
        System.out.println("Book chapter after modification attempt "+b1.getChapter());

    }
}
