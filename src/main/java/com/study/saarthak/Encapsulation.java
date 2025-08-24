package com.study.saarthak;
class Student{
    private String name;
    private int age;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Age must be positive");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setname("Saarthak");
        s1.setage(20);
        System.out.println("Name:"+s1.getname());
        System.out.println("Age:"+s1.getage());
        s1.setage(-20);
    }
}
