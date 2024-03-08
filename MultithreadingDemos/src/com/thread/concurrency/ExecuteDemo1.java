package com.thread.concurrency;

import com.thread.basic.Booking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(10);

        executorService.execute(()->{
            System.out.println("Doing polling");
            Greetings greetings=new Greetings();
            System.out.println(greetings.sayHello("Sima"));
        });
        executorService.execute(()->{
            System.out.println("Extracting name from url");
            Booking booking=new Booking();
            System.out.println(booking.bookTickets("Sri",20));
        });
        executorService.execute(()->{
            System.out.println("Reading from DB");
        });
    }
}
