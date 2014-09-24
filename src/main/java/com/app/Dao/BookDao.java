package com.app.Dao;

import com.app.model.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookDao {
    public List findAllBooks();

    public void addOneBook(Book book);

    public List findBooksByTitle(String title);

    public void updateBookName();

    public void deleteBookByTitle(String title);
}
