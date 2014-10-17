package com.app.model;

import java.io.Serializable;

public class Book implements Serializable {

    private String title;
    private String imagePath;
    private String authors;
    private String isbn;
    private String price;
    private int id;


    public String getIsbn() {
        return isbn;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Book setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getAuthors() {
        return authors;
    }

    public Book setAuthors(String authors) {
        this.authors = authors;
        return this;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Book setImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }

}
