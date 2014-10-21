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

    Book book1;

    @Mock
    BookDao bookDao;

    @InjectMocks
    BookShelfService bookShelfService = new BookShelfService();

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        when(bookDao.findAllBooks()).thenReturn(ImmutableList.of(new Book()));

        book1 = new Book();
        book1.setTitle("thinking in java");
        book1.setImagePath("http://img5.douban.com/Mpic/s27319217.jpg");
        book1.setAuthors("LiuTong");
        book1.setIsbn("9787508645056");
        book1.setPrice("11.2");
    }

    @Test
    public void should_get_all_books() throws Exception {
        List results = bookShelfService.findAllBooks();
        assertThat(results.size(), is(1));
    }

    @Test
    public void should_add_a_book() throws Exception {
        bookShelfService.addOneBook(book1);
        verify(bookDao).addOneBook(book1);
    }

    @Test
    public void should_delete_a_book_by_title() throws Exception {
        bookShelfService.deleteBookByTitle(book1.getTitle());
        verify(bookDao).deleteBookByTitle(book1.getTitle());
    }

    @Test
    public void should_delete_a_book_by_id() throws Exception {
        bookShelfService.deleteBookById(book1.getId());
        verify(bookDao).deleteBookById(book1.getId());
    }

    @Test
    public void should_update_book() throws Exception {
        bookShelfService.updateBookName(book1.getId(), book1.getTitle());
        verify(bookDao).updateBookTitleById(book1.getId(), book1.getTitle());
    }

    @Test
    public void should_update_book_by_id() throws Exception {
        bookShelfService.updateBookById(book1.getId(), book1);
        verify(bookDao).updateBookById(book1.getId(), book1);

    }

    @Test
    public void should_get_books_by_title() throws Exception {
        bookShelfService.findBooksByTitle(book1.getTitle());
        verify(bookDao).findBooksByTitle(book1.getTitle());
    }

    @Test
    public void should_get_book_by_id() throws Exception {
        bookShelfService.findBookById(book1.getId());
        verify(bookDao).findBookById(book1.getId());

    }
}
