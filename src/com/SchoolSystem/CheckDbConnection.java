package src.com.SchoolSystem;

import java.sql.Connection;
import java.sql.SQLException;

public class CheckDbConnection {

    public static void main(String[] args) {
        Connection conn=null;
        try {
            Connection connection = dbConnection.getConnection();
            if(connection!=null)
            {
                System.out.println("Database Connected !!");
            }
        } catch (SQLException e) {
            System.out.println("Database not Connected!!");
            e.printStackTrace();
        }
    }
}
