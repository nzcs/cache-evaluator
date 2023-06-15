package com.example.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static com.example.cache.CacheEvaluatorApplication.BOOK_CACHE;


@Service
public class CacheService {

    @Autowired
    BookRepository repository;


    @Cacheable(value = BOOK_CACHE, key = "{#author, #title}")
    public Book get(String author, String title, LocalDate time) {
        return repository.findBy(author, title, time);
    }


    @CacheEvict(value = BOOK_CACHE, key = "{#book.author, #book.title}")
    public void evict(Book book) {
        System.out.println("evict " + book);
    }

}
