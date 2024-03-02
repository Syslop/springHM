package com.gb.BookStoreApp.controller.impl;

import com.gb.BookStoreApp.controller.BookStoreController;
import com.gb.BookStoreApp.domain.Book;
import com.gb.BookStoreApp.service.OrderServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreControllerImpl implements BookStoreController {
    private OrderServiceFacade orderServiceFacade;


    @Autowired
    public BookStoreControllerImpl(OrderServiceFacade orderServiceFacade) {
        this.orderServiceFacade = orderServiceFacade;
    }

    @Override
    public ResponseEntity<Integer> orderBook(int bookId) {
        boolean status = orderServiceFacade.orderBook(bookId);

        return ResponseEntity.ok(1);
    }
}
