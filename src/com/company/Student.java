package src.com.company;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private String StudentID;
    private String courses="";
    private int tuitionBalance =0;
    private int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: Prompt user to enter student's name and year

    public Student()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name :");
        this.firstName = in.nextLine();

        System.out.println("Enter Student last name :");
        this.lastName = in.nextLine();

        System.out.println("1 - Fresher \n2- xyz \n3- Junion \n4-Senior Enter Student Class level :");
        this.gradeYear = in.nextLine();

        setStudentID();

      //  System.out.println(firstName+" "+lastName+" "+gradeYear+" "+StudentID);


    }


    //Generate ID

    private void setStudentID()
    {
        //Grade Level + ID
        id++;
        this.StudentID =  gradeYear+":"+id;

    }


    //Enroll courses
    public void enroll() {
        String course = "";
        do {
            //Get inside a loop, user hits 0
            System.out.println("Enter Q to Quit !!!");
            Scanner in = new Scanner(System.in);
            course = in.nextLine();


            if (!course.equals("Q")) {
                this.courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            }
            else
            {
                break;
            }

        }while(1!=0);

        //System.out.println("ENROLLED in " + courses);
        //System.out.println("Tution Balance " + tuitionBalance);
    }




    //View Balance
    public void viewBalance()
    {
        System.out.println("Balance is $ "+ tuitionBalance);
    }


    //Pay Tution
    public void payTuition()
    {
        viewBalance();
        System.out.println("Say Payment !!");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment "+payment);
        viewBalance();
    }


    //Show status
    public String showInfo()
    {
        return "Name : "+firstName+" "+lastName+"\n GradeLevel & StudentID "+gradeYear+StudentID +"\n Couses enrolled: "+courses+"\nBalance: $"+tuitionBalance;
    }

}
