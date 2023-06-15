package com.example.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CacheEvaluatorApplicationTests {

    @Autowired
    BookService service;


    @Test
    void test() {
        Book book1 = service.get("AAA", "aaa", DateUtil.parse("2023-05-05"));
        System.out.println("result: " + book1);

        Book book2 = service.get("AAA", "aaa", DateUtil.parse("2023-05-06"));
        System.out.println("result: " + book2);

        Book book3 = service.get("AAA", "aaa", DateUtil.parse("2023-05-07"));
        System.out.println("result: " + book3);

        Book book4 = service.get("AAA", "aaa", DateUtil.parse("2023-05-08"));
        System.out.println("result: " + book4);
    }

}
