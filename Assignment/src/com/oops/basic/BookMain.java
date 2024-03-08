package com.oops.basic;

public class BookMain {
    public static void main(String[] args) {

        Book book=new Book("Header","John",200,"Story");
        book.getDetails();
        book.checkBookType();
        Book book1=new Book("Header","John",800,"Story");
        book1.getDetails();
        book1.checkBookType();



    }
}
