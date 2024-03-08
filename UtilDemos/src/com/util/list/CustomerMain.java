package com.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {

        List<Customer>customerList=new ArrayList<>();
        Customer customer1=new Customer("Ram",10,"Bangalore");
        customerList.add(customer1);
        Customer customer2=new Customer("Sam",11,"Hyderabad");
        customerList.add(customer2);
        Customer customer3=new Customer("Shalini",12,"Chennai");
        customerList.add(customer3);
        Customer customer4=new Customer("Raj",13,"Bhubaneswar");
        customerList.add(customer4);

        customerList.add(new Customer("Sima",1,"Cuttack"));
       for (Customer customer:customerList)
            System.out.println(customer);
        System.out.println(".....");

//        Iterator<Customer> iterator=customerList.iterator();
//        while (iterator.hasNext()){
//            Customer customer= iterator.next();
//           System.out.println(customer);
//        }
        List<Customer>customerByCity=new ArrayList<>();
        for (Customer customer:customerList)
           if (customer.getCity().equals("Bangalore")){
               customerByCity.add(customer);

           }
        for (Customer customer:customerByCity)
            System.out.println(customer);
    }
}
