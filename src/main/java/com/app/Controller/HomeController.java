package com.app.Controller;

import com.app.Service.BookShelfService;
import com.app.model.Book;
import com.app.model.EBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    BookShelfService bookShelfService;

    private Book getBook(HttpServletRequest request) {
        String title = request.getParameter("title");
        String authors = request.getParameter("authors");
        String imagePath = request.getParameter("imagePath");
        String isbn = request.getParameter("isbn");
        String price = request.getParameter("price");

        return new EBook()
                .setTitle(title)
                .setAuthors(authors)
                .setImagePath(imagePath)
                .setIsbn(isbn)
                .setPrice(price);
    }

}
