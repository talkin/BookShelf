package com.app.Dao;

import com.app.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    public List<Book> findAllBooks();

    public void addOneBook(Book book);

    public List findBooksByTitle(String title);

    public void updateBookTitleById(int id, String title);

    public void deleteBookByTitle(String title);

    public Book findBookById(int id);

    public void deleteBookById(int id);

    public void updateBookById(int id, Book book);
}
