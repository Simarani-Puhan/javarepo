package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";

        try  (Connection connection= DriverManager.getConnection(url,username,password);
       Statement statement=connection.createStatement();){
                String sql="Insert into employee values('Sima',2,'Bangalore')";
                boolean result = statement.execute(sql);
          System.out.println("Data inserted :"+ !result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
