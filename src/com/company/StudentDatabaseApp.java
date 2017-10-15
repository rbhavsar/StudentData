package com.company;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] str)
    {
       /* Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.showInfo());*/

        //Ask how many users we want to add
        System.out.println("Enter Number of Student !!!");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i]= new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (Student student : students) {
            System.out.println(student.showInfo());
        }



    }
}
