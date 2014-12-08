package com.app.Service;

import com.app.Dao.BookDao;
import com.app.model.Book;
import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class BookServiceTest {

    Book book;

    @Mock
    BookDao bookDao;

    @InjectMocks
    BookShelfService bookShelfService = new BookShelfService();

    @Before
    public void setUp() throws Exception {
        Book oneBook = createOneBook();
        initMocks(this);
        when(bookDao.findAllBooks()).thenReturn(ImmutableList.of(oneBook));
    }

    private Book createOneBook() {
        book = new Book();
        book.setTitle("thinking in java");
        book.setImagePath("http://img5.douban.com/Mpic/s27319217.jpg");
        book.setAuthors("LiuTong");
        book.setIsbn("9787508645056");
        book.setPrice("11.2");
        return book;
    }

    @Test
    public void should_get_all_books() throws Exception {
        List results = bookShelfService.findAllBooks();
        assertThat(results.size(), is(1));
    }

    @Test
    public void should_add_a_book() throws Exception {
        bookShelfService.addOneBook(book);
        verify(bookDao).addOneBook(book);
    }

    @Test
    public void should_delete_a_book_by_title() throws Exception {
        bookShelfService.deleteBookByTitle(book.getTitle());
        verify(bookDao).deleteBookByTitle(book.getTitle());
    }

    @Test
    public void should_delete_a_book_by_id() throws Exception {
        bookShelfService.deleteBookById(book.getId());
        verify(bookDao).deleteBookById(book.getId());
    }

    @Test
    public void should_update_book() throws Exception {
        bookShelfService.updateBookName(book.getId(), book.getTitle());
        verify(bookDao).updateBookTitleById(book.getId(), book.getTitle());
    }

    @Test
    public void should_update_book_by_id() throws Exception {
        bookShelfService.updateBookById(book.getId(), book);
        verify(bookDao).updateBookById(book.getId(), book);

    }

    @Test
    public void should_get_books_by_title() throws Exception {
        bookShelfService.findBooksByTitle(book.getTitle());
        verify(bookDao).findBooksByTitle(book.getTitle());
    }

    @Test
    public void should_get_book_by_id() throws Exception {
        bookShelfService.findBookById(book.getId());
        verify(bookDao).findBookById(book.getId());

    }
}
