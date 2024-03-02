package com.gb.BookStoreApp.domain;

public class Book implements IBook {
    public int bookId;

    private String name;

    private String author;

    public int numberOfPages;

    public Book() {
    }

    public Book(int bookId, String name) {
        this.bookId = bookId;
        this.name = name;
    }


    @Override
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public static class BookBuilder {
        public final Book book = new Book();

        public BookBuilder author(String author){
            book.setAuthor(author);
            return this;
        }

        public BookBuilder id(int id){
            book.setBookId(id);
            return this;
        }

        public BookBuilder name(String name){
            book.setName(name);
            return this;
        }

        public BookBuilder numberOfPages(int numberOfPages){
            book.setNumberOfPages(numberOfPages);
            return this;
        }

        public Book build() {
            return book;
        }
    }
}
