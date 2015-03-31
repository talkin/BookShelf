package com.app.Controller;

import com.app.Service.db.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BookController {
//    @Autowired
//    BookShelfService bookShelfService;

    @Autowired
    private BookService bookService;

//    @Autowired
//    EmailHelper emailHelper;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showBookList(ModelMap model){
        model.addAttribute("bookList", bookService.findByTitle("hello world"));
        return "bookList";
    }

//    @RequestMapping(value = "/newBook", method = RequestMethod.GET)
//    public String createBookProfile(Model model) {
//        model.addAttribute(new Book());
//        return "newBook";
//    }
//
//    @RequestMapping(value = "/newBook", method = RequestMethod.POST)
//    public String addBook(@ModelAttribute Book book, Model model) {
//        model.addAttribute("book", book);
//        bookShelfService.addOneBook(book);
//        return "redirect:/";
//    }
//
//    @RequestMapping(value = "/deleteBook/{id}", method = RequestMethod.POST)
//    public String deleteBook(@PathVariable int id) {
//        bookShelfService.deleteBookById(id);
//        return "redirect:/";
//    }
//
//    @RequestMapping(value = "/editBook/id={id}", method = RequestMethod.GET)
//    public String amendBook(@PathVariable int id, @ModelAttribute Book book, Model model) {
//        model.addAttribute("id", id);
//        book = bookShelfService.findBookById(id);
//        model.addAttribute(book);
//        return "editBook";
//    }
//
//    @RequestMapping(value = "/editBook/id={id}", method = RequestMethod.POST)
//    public String submitAmend(@PathVariable int id, @ModelAttribute Book book) {
//        bookShelfService.updateBookById(id, book);
//        return "redirect:/";
//    }
//
//    @RequestMapping(value = "/view/id={id}", method = RequestMethod.GET)
//    public String viewBook(@PathVariable int id, @ModelAttribute Book book, Model model) {
//        model.addAttribute("id", id);
//        book = bookShelfService.findBookById(id);
//        model.addAttribute(book);
//        return "view";
//    }

//    @RequestMapping(value = "/view/id={id}", method = RequestMethod.POST)
//    public String updateBook(@PathVariable int id, Book book) {
//        bookShelfService.updateBookById(id, book);
//        return "redirect:/";
//    }

 }
