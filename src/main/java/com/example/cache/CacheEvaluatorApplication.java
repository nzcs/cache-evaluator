package com.example.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class CacheEvaluatorApplication {

    public static final String BOOK_CACHE = "bookCache";


    public static void main(String[] args) {
        SpringApplication.run(CacheEvaluatorApplication.class, args);
    }


    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager(BOOK_CACHE);
    }
}
