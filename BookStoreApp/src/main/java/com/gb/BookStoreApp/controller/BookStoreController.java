package com.gb.BookStoreApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public interface BookStoreController {
    @PostMapping("/order/{bookId}")
    public ResponseEntity<Integer> orderBook(@PathVariable int bookId);
}
