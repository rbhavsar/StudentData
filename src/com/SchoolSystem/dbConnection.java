package src.com.SchoolSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbConnection {

    private static final String USERNAME = "birstuser";
    private static final String PASSWORD = "birst@123";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String SQLCONN = "jdbc:sqlserver://rbhavsar21;user=birstuser;password=birst@123;database=School";


    public static Connection getConnection() throws SQLException{

        File file = new File("/Users/rbhavsar/StudentData/Data/src/com/SchoolSystem/config.properties");
        Properties prop = new Properties();
        FileInputStream fileInput = null;
        initProperties(file,prop,fileInput);
        System.out.println(prop.getProperty("driver"));
        System.out.println(prop.getProperty("sqlCoon"));

        try {
            Class.forName(prop.getProperty("driver"));
            return DriverManager.getConnection(prop.getProperty("sqlCoon"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }

    private static void initProperties(File file, Properties prop, FileInputStream fileInput) {

        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //load properties file
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
