package com.example.cache;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Data
@Accessors(chain = true)
public class Book {

    String author;
    String title;
    LocalDate start;
    LocalDate end;
}
