package com.gb.BookStoreApp.domain.impl;

import com.gb.BookStoreApp.domain.BookFactory;
import com.gb.BookStoreApp.domain.IBook;

public class BookFactoryImpl implements BookFactory {
    @Override
    public IBook createBook(int id) {
        Book.BookBuilder bookBuilder = new Book.BookBuilder();
        bookBuilder.id(id).author("Достоевский").name("Преступление и наказание").numberOfPages(672);

        return bookBuilder.build();
    }
}
