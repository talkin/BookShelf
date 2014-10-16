package Dao;

import com.app.Dao.BookDao;
import com.app.model.Book;
import com.app.model.PaperBook;
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
//@ContextConfiguration(locations = {"/Dao/applicationContext-test.xml"})
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Test
    public void should_add_one_book() throws Exception {
        List before = bookDao.findAllBooks();
        Book book = someBook();
        bookDao.addOneBook(book);
        List after = bookDao.findAllBooks();
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
        Book book = someBook();
        bookDao.addOneBook(book);
        List books = bookDao.findBookById(book.getId());
        assertThat(books.size(), is(1));
    }

    @Test
    public void should_update_book_name() throws Exception {
        Book book = someBook();
        bookDao.addOneBook(book);
        book.setTitle("world");
        bookDao.updateBookName();
        assertThat(book.getTitle(), is("world"));
    }

    private Book someBook() {
        return new PaperBook()
                .setTitle("hello")
                .setImagePath("http://img3.douban.com/mpic/s27301840.jpg")
                .setAuthors("tom")
                .setIsbn("9787544269544")
                .setPrice("11.2");
    }


}
