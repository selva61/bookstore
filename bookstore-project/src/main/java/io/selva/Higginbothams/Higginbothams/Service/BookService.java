package io.selva.Higginbothams.Higginbothams.Service;

import io.selva.Higginbothams.Higginbothams.Model.Book;
import io.selva.Higginbothams.Higginbothams.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> getAllBooks(){
        return (List<Book>) bookRepository.findAll();
    }

    public Book getBook(String id){
        return (Book) bookRepository.findById(id).orElse(null);
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }
}
