package Dao;

import com.app.Dao.BookDao;
import com.app.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext-test.xml")
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Test
    public void should_add_one_book() throws Exception {
        List<Book> before = bookDao.findAllBooks();
        Book book = someBook();
        bookDao.addOneBook(book);
        List<Book> after = bookDao.findAllBooks();
        assertThat(after.size(), is(before.size() + 1));
    }

    @Test
    public void should_find_book_by_title() throws Exception {
        Book book = someBook();
        bookDao.addOneBook(book);
        List books = bookDao.findBooksByTitle(book.getTitle());
        assertThat(books.size(), is(not(0)));
    }

    @Test
    public void should_delete_book_by_title() throws Exception {
        Book book = someBook();
        bookDao.addOneBook(book);
        bookDao.deleteBookByTitle(book.getTitle());
        List books = bookDao.findBooksByTitle(book.getTitle());
        assertThat(books.size(), is(0));
    }

    @Test
    public void should_find_book_by_id() throws Exception {
        Book book = bookDao.findBookById(1);
        assertThat(book.getTitle(), is("柏油娃娃"));
        assertThat(book.getImagePath(), is("http://img3.douban.com/spic/s27301840.jpg"));
        assertThat(book.getAuthors(), is("[美]托妮·莫里森"));
        assertThat(book.getIsbn(), is("9787544269544"));
        assertThat(book.getPrice(), is("11.2"));
    }

    @Test
    public void should_update_book_name_by_id() throws Exception {
        bookDao.updateBookTitleById(239, "changeTitle");
        System.out.println(bookDao.findBookById(239));
        assertThat(bookDao.findBookById(239).getTitle(), is("changeTitle"));
    }

    private Book someBook() {
        return new Book()
                .setTitle("hello")
                .setImagePath("http://img3.douban.com/mpic/s27301840.jpg")
                .setAuthors("tom")
                .setIsbn("9787544269544")
                .setPrice("11.2");
    }


}
