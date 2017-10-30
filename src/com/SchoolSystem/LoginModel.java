package com.SchoolSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginModel {


    Connection connection;

    public LoginModel()
    {
        try
        {
            this.connection = dbConnection.getConnection();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        if(this.connection==null)
        {
            System.exit(1);
        }

    }

    public boolean isDatabaseConnected()
    {
        return this.connection!=null;
    }

    public boolean isLogin(String user,String password,String opt) throws Exception
    {
        PreparedStatement pr = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM login where username = ? and password =? and division = ?";
        try
        {
            pr = this.connection.prepareStatement(sql);
            pr.setString(1,user);
            pr.setString(2,password);
            pr.setString(3,opt);

            rs = pr.executeQuery();

            boolean bol;
            rs.next();
            int rowCount = rs.getInt(1);
            System.out.println("count "+rowCount);

        }
        catch (SQLException e) {

            return false;
         }

         finally {
            pr.close();
            rs.close();
        }

        return false;
    }

}
