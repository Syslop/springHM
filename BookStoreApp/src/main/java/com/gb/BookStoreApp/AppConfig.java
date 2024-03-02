package com.gb.BookStoreApp;

import com.gb.BookStoreApp.domain.BookFactory;
import com.gb.BookStoreApp.domain.impl.BookFactoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public BookFactory bookFactory() {
        return new BookFactoryImpl();
    }
}
