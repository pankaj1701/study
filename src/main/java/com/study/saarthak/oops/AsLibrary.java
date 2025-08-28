package com.study.saarthak.oops;

import java.util.ArrayList;
import java.util.List;

public class AsLibrary {
    private List<AsBook> books;
    public AsLibrary(List<AsBook> books) {
        this.books = books;
    }
    public void showBooks(){
        for(AsBook b:books){
            System.out.println("Book:"+b.getTitle()+"Author:"+b.getAuthor());
        }
    }

    public static void main(String[] args) {
        AsAuthor a1 = new AsAuthor();
        AsAuthor a2 = new AsAuthor();
        a1.Asauthor("J.K rowling");
        a2.Asauthor("J.R.R Tolkien");
        AsBook b1 = new AsBook("Harry Potter ",a1);
        AsBook b2 = new AsBook("Lord Of The Rings ",a2);

        List<AsBook> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);

        AsLibrary library = new AsLibrary(books);
        library.showBooks();
    }
}
