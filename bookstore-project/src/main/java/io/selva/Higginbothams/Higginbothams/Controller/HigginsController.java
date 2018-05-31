package io.selva.Higginbothams.Higginbothams.Controller;

import io.selva.Higginbothams.Higginbothams.Model.Book;
import io.selva.Higginbothams.Higginbothams.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@ComponentScan(basePackages = "io.selva.higginbothams.*")
//@ComponentScan(basePackageClasses = BookService.class)
public class HigginsController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllbooks(){
        return bookService.getAllBooks();
    }

   @RequestMapping("/books/{id}")
    public Book getBookById(@PathVariable String id){
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateBook(@RequestBody Book book){
        bookService.updateBook(book);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
    public void deleteBookById(@PathVariable String id){
        bookService.deleteBook(id);
    }
}
