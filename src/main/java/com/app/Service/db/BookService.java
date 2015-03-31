package com.app.Service.db;

import com.app.domain.Book;

import java.util.List;

/**
 * Created by jtao on 3/19/15.
 */
public interface BookService {
   List<Book> findByTitle(String title);
}
