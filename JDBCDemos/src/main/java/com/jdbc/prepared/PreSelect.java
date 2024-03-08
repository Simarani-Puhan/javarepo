package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class PreSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "Select * from cab";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs=statement.executeQuery();
        ) {
                while (rs.next()){
                 int cabNumber=rs.getInt("cab_number");
                 String driverName=rs.getString("driver_Name");
                 String pickLoc=rs.getString("pick_loc");
                 String dropLoc=rs.getString("drop_loc");
                 Time time=rs.getTime("pickup_time");
                 LocalTime pickupTime=LocalTime.parse(time.toString());
                 LocalDate pickupDate=LocalDate.parse(rs.getDate("pickup_date").toString());
                    LocalTime localTime=LocalTime.parse(time.toString());
                    LocalDate date=LocalDate.parse(rs.getDate("pickup_date").toString());
                    System.out.println(cabNumber+"\t"+pickLoc+"\t"+pickupTime+"\t"+pickupDate+"\t"+dropLoc+"\t"+driverName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
