package com.util.set;

import com.list.custom.Book;

import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book>books= Arrays.asList(
                new Book("The Story","John",100),
                new Book("The Story","John",100),
                new Book("Java","Kathy",260),
                new Book("Spring","Robbin",2500),
                new Book("Leadership","John",30));

        System.out.println("List book");
        for(Book book:books){
            System.out.println(book);
        }
        System.out.println("Set book");
       // Set<Book>bookSet=new LinkedHashSet<>(books);
        Set<Book>bookSet=new TreeSet<>(books);
        for (Book book:bookSet){
            System.out.println(book);
        }

    }
}
