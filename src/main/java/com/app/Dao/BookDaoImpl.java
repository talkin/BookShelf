package com.app.Dao;

import com.app.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class BookDaoImpl implements BookDao{
    DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List findAllBooks() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String selectQuery = "SELECT * FROM book";
        List<Map<String, Object>> bookList = jdbcTemplate.queryForList(selectQuery);
        return bookList;
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
    public void updateBookName() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String updateQuery = "UPDATE book SET title=? WHERE title=?";
    }

    @Override
    public void deleteBookByTitle(String title) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String deleteQuery = "DELETE FROM book WHERE title=?";
        jdbcTemplate.update(deleteQuery, title);
    }
}
