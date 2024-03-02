package com.gb.BookStoreApp.service.impl;

import com.gb.BookStoreApp.domain.BookFactory;
import com.gb.BookStoreApp.domain.IBook;
import com.gb.BookStoreApp.service.InventoryService;
import com.gb.BookStoreApp.service.OrderServiceFacade;
import com.gb.BookStoreApp.service.PaymentService;
import com.gb.BookStoreApp.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceFacadeImpl implements OrderServiceFacade {
    @Autowired
    private BookFactory bookFactory;
    @Override
    public boolean orderBook(int bookId) {
        boolean orderFulfilled = false;

        //Book.BookBuilder bookBuilder = new Book.BookBuilder();
        //bookBuilder.id(bookId).author("Достоевский").name("Преступление и наказание").numberOfPages(672);

        //final Book book = bookBuilder.build();

        IBook book = bookFactory.createBook(bookId);

        if (InventoryService.isAvailabel(book)) {
            System.out.println("Book available");
            boolean paymentConfirmed = PaymentService.makePayment();

            if (paymentConfirmed){
                System.out.println("Payment confirm");
                ShippingService.shipBook(book);
                System.out.println("Book shipping");
                orderFulfilled = true;
            }
        }
        System.out.println(book.toString());
        return orderFulfilled;
    }
}
