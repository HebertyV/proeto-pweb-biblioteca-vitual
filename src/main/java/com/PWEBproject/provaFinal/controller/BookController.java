package com.PWEBproject.provaFinal.controller;

import com.PWEBproject.provaFinal.entity.Book;
import com.PWEBproject.provaFinal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save/book")
    public Book saveBook(@RequestBody Book book){
       return bookService.saveBook(book);

    }
    @GetMapping("/get/book")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
    @GetMapping("/get/book/{bookId}")
    public Book getBook(@PathVariable Integer bookId){
       return bookService.getBooks(bookId);
    }
    @DeleteMapping("/delete/book/{bookId}")
    public void deleteBook(@PathVariable Integer bookId){
        bookService.deleteBook(bookId);
    }
    @PutMapping("/update/book")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }
}
