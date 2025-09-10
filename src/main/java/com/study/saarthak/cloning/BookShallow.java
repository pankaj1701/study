package com.study.saarthak.cloning;

public class BookShallow implements Cloneable{
    AuthorShallow authorShallow;
    String name;
    BookShallow(String name,AuthorShallow authorShallow){
        this.name=name;
        this.authorShallow=authorShallow;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
