package com.PWEBproject.provaFinal.dao;

import com.PWEBproject.provaFinal.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao  extends CrudRepository<Book, Integer> {
}
