package com.app.Service.db.impl;

import com.app.Service.db.BookService;
import com.app.domain.Book;
import com.app.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jtao on 3/19/15.
 */
@Service ("BookService")
@Repository
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
