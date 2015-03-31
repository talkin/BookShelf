package com.app.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table (name = "book")
public class Book implements Serializable {

    private static final int MAX_ISBN_LENGTH = 13;

    @Id
    private int id;

    @Column
    private String title;

    @Column
    private String imagePath;

    @Column
    private String authors;

    @Column
    @Size (max = MAX_ISBN_LENGTH)
    private String isbn;

    @Column
    private String price;

    @Column (nullable = false)
    @Enumerated (EnumType.STRING)
    private BookType type;

    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }

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

    public BookType getType() {
        return type;
    }

    public Book setType(BookType type) {
        this.type = type;
        return this;
    }
}
