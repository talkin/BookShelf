package com.app.model;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract class Book implements Serializable {

    private String title;
    private String imagePath;
    private String authors;
    private String isbn;
    private BigDecimal price;

    abstract String getLocation();

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

    public BigDecimal getPrice() {
        return price;
    }

    public Book setPrice(BigDecimal price) {
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
}
