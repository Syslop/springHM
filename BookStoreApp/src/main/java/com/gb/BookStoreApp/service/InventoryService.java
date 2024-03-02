package com.gb.BookStoreApp.service;

import com.gb.BookStoreApp.domain.IBook;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    public static boolean isAvailabel(IBook book) {
        return true;
    }
}
