package com.PWEBproject.provaFinal.service;

import com.PWEBproject.provaFinal.dao.BookDao;
import com.PWEBproject.provaFinal.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BookDao bookDao;

    @Autowired
    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Book saveBook(Book book){
        return bookDao.save(book);
    }

    public List<Book> getBooks(){
        List<Book> books =new ArrayList<>();
        bookDao.findAll().forEach(books::add);
        return books;
    }

    public Book getBooks( Integer bookId){
        return bookDao.findById(bookId).orElseThrow();
    }

    public void deleteBook(Integer bookId){
        bookDao.deleteById(bookId);
    }

    public Book updateBook(Book book){
        bookDao.findById(book.getBookId()).orElseThrow();
        return bookDao.save(book);
    }
}
