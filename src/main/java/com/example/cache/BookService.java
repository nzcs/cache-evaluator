package com.example.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookService {

    @Autowired
    CacheService cacheService;


    public Book get(String author, String title, LocalDate time) {
        System.out.println("get " + author + " " + title + " " + time);
        Book book = cacheService.get(author, title, time);

        if (time.isAfter(book.start) && !time.isAfter(book.end)) {
            return book;
        }

        cacheService.evict(book);

        return cacheService.get(author, title, time);
    }
}
