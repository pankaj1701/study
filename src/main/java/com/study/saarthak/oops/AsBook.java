package com.study.saarthak.oops;

public class AsBook {
    private String title;
    private AsAuthor author;
    public AsBook(String title, AsAuthor author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author.getName();
    }
}
