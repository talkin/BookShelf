package com.app.Controller;

import com.app.Service.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    BookShelfService bookShelfService;

    @RequestMapping(method = RequestMethod.GET)
    public String gotoHome(ModelMap model){
        model.addAttribute("items", "hello");
        model.addAttribute("itemList", bookShelfService.findAllBooks());
        return "home";
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public String addBook() {
        return "addBook";
    }

    @RequestMapping(value = "/deleteBook", method = RequestMethod.GET)
    public String delete() {
        return "home";
    }

}
