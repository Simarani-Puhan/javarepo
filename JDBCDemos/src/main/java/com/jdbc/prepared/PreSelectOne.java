package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class PreSelectOne {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "Select * from cab where drop_loc=?";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, "KRPuram");
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    int cabNumber = resultSet.getInt("cab_number");
                    String driverName = resultSet.getString("driver_name");
                    String pickLoc = resultSet.getString("pickup_Loc");
                    String dropLoc = resultSet.getString("drop_loc");
                    Time time = resultSet.getTime("pickup_time");
                    LocalTime pickupTime = LocalTime.parse(time.toString());
                    LocalDate pickupDate = LocalDate.parse(resultSet.getDate("pickup_date").toString());
                    LocalTime localTime = LocalTime.parse(time.toString());
                    LocalDate date = LocalDate.parse(resultSet.getDate("pickup_date").toString());
                    System.out.println(cabNumber + "\t" + pickLoc + "\t" + pickupTime + "\t" + pickupDate + "\t" + dropLoc + "\t" + driverName);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
