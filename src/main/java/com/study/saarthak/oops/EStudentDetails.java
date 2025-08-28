package com.study.saarthak.oops;

public class EStudentDetails {
    private String name;
    private float marks;
    private String rollNo;

    public void setName(String name) {
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }
    public float getMarks(){
        return marks;
    }
    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }
    public String getRollNo(){
        return rollNo;
    }
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        EStudentDetails studentDetails1 = new EStudentDetails();
        studentDetails1.setName("Saarthak");
        studentDetails1.setMarks(50);
        studentDetails1.setRollNo("RA2311026010490");
        studentDetails1.printDetails();
        EStudentDetails studentDetails2 = new EStudentDetails();
        studentDetails2.setName("Kaavya");
        studentDetails2.setMarks(50);
        studentDetails2.setRollNo("RA2311026010491");
        studentDetails2.printDetails();
    }
}
