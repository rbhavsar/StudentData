package src.com.SchoolSystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentData {

    private String sql = "SELECT * FROM students";
    private List<String> studentsData=new ArrayList<String>();
    private Connection connection;

    protected void loadStudentData() throws SQLException
    {
        try
        {
           connection = dbConnection.getConnection();
            ResultSet rs = connection.createStatement().executeQuery(sql);

            while(rs.next())
            {
                studentsData.add(rs.getString(1));
                studentsData.add(rs.getString(2));
                studentsData.add(rs.getString(3));
                studentsData.add(rs.getString(4));
                studentsData.add(rs.getString(5));
            }
        }
        catch (SQLException e)
        {

        }
        finally {

        }

        for (String students : studentsData) {
            System.out.println(students);
        }
    }




}
