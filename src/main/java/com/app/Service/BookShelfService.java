package com.app.Service;

import com.app.Dao.BookDao;
import com.app.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookShelfService {

    @Autowired
    private BookDao bookDao;

    public List findAllBooks() {
        return bookDao.findAllBooks();
    }

    public List findBooksByTitle(String title) {
        return bookDao.findBooksByTitle(title);
    }

    public void addOneBook(Book book) {
        bookDao.addOneBook(book);
    }

    public void deleteOneBookByTitle(String title) {
        bookDao.deleteBookByTitle(title);
    }

    public void updateBookName() {
        bookDao.updateBookName();
    }
}
