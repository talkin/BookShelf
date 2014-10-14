package com.app.Controller;

import com.app.Service.BookShelfService;
import com.app.model.EBook;
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

    @RequestMapping(value = "/newPage", method = RequestMethod.GET)
    public String createBookProfile(ModelMap model) {
        model.addAttribute(new EBook());
        return "newBook";
    }

    @RequestMapping(value = "/newBook", method = RequestMethod.POST)
    public String addBook(EBook book) {
        bookShelfService.addOneBook(book);
        return "redirect:/";
    }

    @RequestMapping(value = "/{title}", method = RequestMethod.GET)
    public String showBookProfile(@PathVariable String title, Model model) {
        model.addAttribute("books", bookShelfService.findBooksByTitle(title));
        return "view";
    }
 }
