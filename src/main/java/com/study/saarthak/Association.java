package com.study.saarthak;

class javaStudents {
    String name;
    javaStudents(String name){
        this.name=name;
    }
}
class teacher{
    String teacherName;
    teacher(String teacherName){
        this.teacherName=teacherName;
    }
    void teaches(javaStudents student){
        System.out.println(teacherName+" teaches "+student.name);

    }
}
public class Association {
    public static void main(String[] args) {
        javaStudents s1=new javaStudents("Saarthak");
        javaStudents s2=new javaStudents("Kaavya");
        teacher teacher=new teacher("Pankaj");
        teacher.teaches(s1);
        teacher.teaches(s2);
    }
}