package com.SchoolSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class AddStudents {

    String x="0";
    public void insertStudents() {
        Connection connection = null;
        String sqlInsert = "INSERT INTO students(id,fname,lname,email,DOB) VALUES (?,?,?,?,?)";
        try {
            connection = dbConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sqlInsert);

            stmt.setString(1, getRandomNumber());
            stmt.setString(2, "Ronak");
            stmt.setString(3, "Patel");
            stmt.setString(4, "rpatel@gmail.com");
            stmt.setString(5, "11/11/1986");

            stmt.executeQuery();
            connection.close();
        } catch (SQLException e) {

        } finally {

        }
    }

    private String getRandomNumber()
    {
        Random rand = new Random();
        int value = rand.nextInt(50);
        return  Integer.toString(value);


    }


}
