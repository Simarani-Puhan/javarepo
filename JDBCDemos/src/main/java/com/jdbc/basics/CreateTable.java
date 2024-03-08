package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class CreateTable {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";
        //get the connection object
        Connection connection= getConnection(url,username,password);
        //creste a statement object
        Statement statement=connection.createStatement();
        //The sql query to be executed
        String sql="Create table employee(name varchar(20),employeeId int primary key,city varchar(20))";

        try {
            boolean result = statement.execute(sql);
            System.out.println("Table created"+ !result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
