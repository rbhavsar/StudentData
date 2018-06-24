package src.com.SchoolSystem;

import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        LoginModel lm = new LoginModel();
        lm.isDatabaseConnected();

        try {
            boolean login = lm.isLogin("rbhavsar","birst123","Admin");
            if(!login)
            {
                System.out.println("UserName or Password or Department is Wrong !!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        StudentData std = new StudentData();
        try {
            std.loadStudentData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        AddStudents insertStudent = new AddStudents();
        insertStudent.insertStudents();
    }




}
