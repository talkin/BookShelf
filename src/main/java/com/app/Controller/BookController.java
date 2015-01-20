package com.app.Controller;

import com.app.Service.BookShelfService;
import com.app.form.BookForm;
import com.app.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BookController {
    @Autowired
    BookShelfService bookShelfService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showBookList(ModelMap model){
        model.addAttribute("bookList", bookShelfService.findAllBooks());
        return "bookList";
    }

    @RequestMapping(value = "/newBook", method = RequestMethod.GET)
    public String createBookProfile(ModelMap model) {
        BookForm bookForm = new BookForm();
        model.addAttribute(bookForm);
        return "newBook";
    }

    @RequestMapping(value = "/newBook", method = RequestMethod.POST)
    public String addBook(Book book, BookForm bookForm) {
        book.setTitle(bookForm.getTitle());
        book.setAuthors(bookForm.getAuthors());
        book.setImagePath(bookForm.getImagePath());
        book.setIsbn(bookForm.getIsbn());
        book.setPrice(bookForm.getPrice());
        book.setType(bookForm.getType());
        bookShelfService.addOneBook(book);
        return "redirect:/";
    }

    @RequestMapping(value = "/deleteBook/{id}", method = RequestMethod.POST)
    public String deleteBook(@PathVariable int id) {
        bookShelfService.deleteBookById(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/editBook/id={id}", method = RequestMethod.GET)
    public String amendBook(@PathVariable int id, Model model, BookForm bookForm) {
        model.addAttribute("id", id);
        Book book = bookShelfService.findBookById(id);
        bookForm.setTitle(book.getTitle());
        bookForm.setAuthors(book.getAuthors());
        bookForm.setImagePath(book.getImagePath());
        bookForm.setIsbn(book.getIsbn());
        bookForm.setPrice(book.getPrice());
        bookForm.setType(book.getType());
        model.addAttribute(bookForm);
        return "editBook";
    }

    @RequestMapping(value = "/editBook/id={id}", method = RequestMethod.POST)
    public String submitAmend(@PathVariable int id, Book book, BookForm bookForm) {
        book.setTitle(bookForm.getTitle());
        book.setAuthors(bookForm.getAuthors());
        book.setImagePath(bookForm.getImagePath());
        book.setIsbn(bookForm.getIsbn());
        book.setPrice(bookForm.getPrice());
        book.setType(bookForm.getType());
        bookShelfService.updateBookById(id, book);
        return "redirect:/";
    }

    @RequestMapping(value = "/view/id={id}", method = RequestMethod.GET)
    public String viewBook(@PathVariable int id, Model model, BookForm bookForm) {
        model.addAttribute("id", id);
        Book book = bookShelfService.findBookById(id);
        bookForm.setTitle(book.getTitle());
        bookForm.setAuthors(book.getAuthors());
        bookForm.setImagePath(book.getImagePath());
        bookForm.setIsbn(book.getIsbn());
        bookForm.setPrice(book.getPrice());
        bookForm.setType(book.getType());
        model.addAttribute(bookForm);
        return "view";
    }

//    @RequestMapping(value = "/view/id={id}", method = RequestMethod.POST)
//    public String updateBook(@PathVariable int id, Book book) {
//        bookShelfService.updateBookById(id, book);
//        return "redirect:/";
//    }

 }
