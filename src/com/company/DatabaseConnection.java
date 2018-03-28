package com.company;

import java.sql.*;
import java.sql.DriverManager;

public class DatabaseConnection {

    protected Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection("jdbc:sqlserver://rbhavsar21;user=birstuser;password=birst@123;database=StudentData");
    }

}


