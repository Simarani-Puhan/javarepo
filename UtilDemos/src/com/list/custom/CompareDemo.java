package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {

        List<Book>books= Arrays.asList(
                new Book("The Story","John",100),
                new Book("Java","Kathy",260),
                new Book("Spring","Robbin",2500),
                new Book("Leadership","John",30));

        for (Book book:books)
            System.out.println(book);
        System.out.println("After sorting");
        Collections.sort(books);
        for (Book nbook:books)
            System.out.println(nbook);
    }
}
