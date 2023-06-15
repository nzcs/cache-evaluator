package com.example.cache;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookRepository {

    public Book findBy(String author, String title, LocalDate time) {
        Book book = new Book()
                .setAuthor(author)
                .setTitle(title)
                .setStart(time.minusDays(1))
                .setEnd(time.plusDays(1));
        System.out.println("repository: " + book);
        return book;
    }
}
