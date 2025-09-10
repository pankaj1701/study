package com.study.saarthak.immutableclass;
import java.util.*;
public class ImmutableBook {
    private final String name;
    private final String author;
    private final List<String> chapter;

    public ImmutableBook(String name, String author, List<String> chapter) {
        this.name = name;
        this.author = author;
        this.chapter = new ArrayList<>(chapter);
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public List<String> getChapter() {
        return new ArrayList<>(chapter);
    }
}
