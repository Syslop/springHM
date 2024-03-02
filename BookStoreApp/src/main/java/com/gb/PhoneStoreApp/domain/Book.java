package com.gb.BookStoreApp.domain;

public class Book implements IBook {
    public int phoneId;

    private String name;

    private String color;

    public int customProperty;

    public Book(int phoneId, String name) {
        this.phoneId = phoneId;
        this.name = name;
    }


    @Override
    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCustomProperty() {
        return customProperty;
    }

    public void setCustomProperty(int customProperty) {
        this.customProperty = customProperty;
    }
}
