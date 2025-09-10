package com.study.saarthak.cloning;

import java.awt.print.Book;

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        try {
            StudentCloneShallow s1 = new StudentCloneShallow(1, "Saarthak");
            StudentCloneShallow s2 = (StudentCloneShallow) s1.clone();

            System.out.println("Original: " + s1.id + " " + s1.name);
            System.out.println("Cloned:   " + s2.id + " " + s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
            AddressDeep addr1 = new AddressDeep("Chennai", "TN");
            StudentDetailsDeep s1 = new StudentDetailsDeep(101, "Saarthak", addr1);


            StudentDetailsDeep s2 = (StudentDetailsDeep) s1.clone();


            s2.address.city = "Delhi";

            System.out.println("Original Student: " + s1.name + " - " + s1.address.city);
            System.out.println("Cloned Student:   " + s2.name + " - " + s2.address.city);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        AuthorShallow a1 = new AuthorShallow("J.K Rowling");
        BookShallow b1 = new BookShallow("Harry Potter",a1);

        BookShallow b2=(BookShallow) b1.clone();
        b2.authorShallow.name="JK Tolkien";
        System.out.println("Orignal name "+b1.authorShallow.name);
        System.out.println("Cloned name "+b2.authorShallow.name);

        EngineDeep e1 = new EngineDeep(1000);
        CarDeep c1 = new CarDeep("Toyota",e1);
        CarDeep c2 = (CarDeep) c1.clone();
        c2.engineDeep.horsepower = 2000;
        System.out.println("Orignal Engine "+c1.engineDeep.horsepower);
        System.out.println("Cloned Engine "+c2.engineDeep.horsepower);

    }
}

