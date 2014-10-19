package com.app.Controller;

import com.app.Service.BookShelfService;
import com.app.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/newPage", method = RequestMethod.GET)
    public String createBookProfile(ModelMap model) {
        model.addAttribute(new Book());
        return "newBook";
    }

    @RequestMapping(value = "/newBook", method = RequestMethod.GET)
    public String addBook(Book book) {
        bookShelfService.addOneBook(book);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String deleteBook(@PathVariable int id) {
        bookShelfService.deleteBookById(id);
        return "redirect:/";
    }


//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public String showBookProfile(@PathVariable int id, Model model) {
//        model.addAttribute("books", bookShelfService.findBookById(id));
//        return "view";
//    }
 }
