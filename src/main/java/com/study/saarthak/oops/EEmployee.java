package com.study.saarthak.oops;

public class EEmployee {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void increaseSalary(double percentage) {
        this.salary += (salary * (percentage/100));
    }

    public static void main(String[] args) {
        EEmployee e = new EEmployee();
        e.name = "Saarthak";
        e.id = "1";
        e.salary = 100000;
        e.increaseSalary(7);
        System.out.println("Your salary is: " + e.getSalary());
    }


}
