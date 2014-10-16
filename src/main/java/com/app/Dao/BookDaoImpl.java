package com.app.Dao;

import com.app.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BookDaoImpl implements BookDao{
    @Autowired
    DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Book> findAllBooks() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String selectQuery = "SELECT * FROM book";
        List<Map<String, Object>> bookList = jdbcTemplate.queryForList(selectQuery);

        Iterator it = bookList.iterator();
        ArrayList<Book> books = new ArrayList<Book>();

        while(it.hasNext()) {
            Book book = new Book();
            Map map = (Map) it.next();
            book.setTitle(map.get("title").toString());
            book.setImagePath(map.get("imagePath").toString());
            book.setAuthors(map.get("author").toString());
            book.setIsbn(map.get("ISBN").toString());
            book.setPrice(map.get("price").toString());

            System.out.println(book.getIsbn());
            System.out.println(book.getTitle());

            System.out.println(book);

            books.add(book);
        }

        System.out.println(books);

        return books;
    }

    @Override
    public void addOneBook(Book book) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String addQuery = "INSERT INTO book (title, imagePath, author, ISBN, price)"
                + " VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(addQuery, book.getTitle(), book.getImagePath(), book.getAuthors(), book.getIsbn(), book.getPrice());
    }

    @Override
    public List findBooksByTitle(String title) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String selectQuery = "SELECT * FROM book WHERE title = ?";
        List<Map<String, Object>> bookList = jdbcTemplate.queryForList(selectQuery, title);
        return bookList;
    }

    @Override
    public void updateBookTitleById(int id, String title) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String updateQuery = "UPDATE book SET title=" + title + " WHERE id=" + id;

        System.out.println(updateQuery);
        jdbcTemplate.update(updateQuery);
    }

    @Override
    public void deleteBookByTitle(String title) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String deleteQuery = "DELETE FROM book WHERE title=?";
        jdbcTemplate.update(deleteQuery, title);
    }

    @Override
    public Book findBookById(int id) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String selectQuery = "SELECT * FROM book WHERE id = " + id;

        List books = jdbcTemplate.queryForList(selectQuery);
        Iterator it = books.iterator();
        Book book = new Book();

        while(it.hasNext()) {
            Map map = (Map) it.next();
            book.setTitle(map.get("title").toString());
            book.setImagePath(map.get("imagePath").toString());
            book.setAuthors(map.get("author").toString());
            book.setIsbn(map.get("ISBN").toString());
            book.setPrice(map.get("price").toString());
        }
        return book;
    }

}
