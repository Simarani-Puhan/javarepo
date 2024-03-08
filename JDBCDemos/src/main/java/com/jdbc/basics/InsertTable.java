package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";
        //get the connection object
     try  (Connection connection= DriverManager.getConnection(url,username,password);
        //creste a statement object
        Statement statement=connection.createStatement();){
                 String sql="Insert into employee values('Priya',1,'Bangalore')";
                 boolean result = statement.execute(sql);
           System.out.println("Data inserted :"+ !result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
