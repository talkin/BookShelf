package com.app.domain;

/**
 * Created by jtao on 3/19/15.
 */
public enum BookType {
    EBook("EBook"),
    PaperBook("PaperBook");

    private String value;

    BookType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
