package com.emailapp;

import java.util.Scanner;

public class Email {

    //Variables

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix="Infor";
    private int mailBoxCapacity;
    private String alternateEmail;

    //Constructor for fistName and lastName
    public Email(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=setDepartment();
        this.password=randomPassword(5);
        //System.out.println("For Email Addres :\nfirstName :"+this.firstName+"\nLastName :"+this.lastName+"\nDepartment :"+this.department
        //+"\npassword "+password);

        //Combine Elements to generate Email
        email = generateEmailAddress();
        System.out.println("email :"+email);
    }

    //Ask for Departement
    private String setDepartment()
    {
        System.out.print("Enter Department\n1 for sales\2 for Development\n3 for accounting\n0 for nothing \nEnter Department :");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if(deptChoice==1) { return "sales"; }
        else if(deptChoice==2) {return  "dev";}
        else if(deptChoice==3){return "acct";}
        else {return "";}
    }


    //Generate Random Password
    private String randomPassword(int len)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQR!@#$%^&*";
        char[] password = new char[len];
        for(int i=0;i<len;i++)
        {
            int rand = (int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }

        return new String(password);

    }

    //generate Email Address
    private String generateEmailAddress()
    {
       return firstName.toLowerCase() + "."+lastName.toLowerCase() + "@"+department+"."+companySuffix+".com";
    }

    //Set Mailbox Capacity
    public void setMailBoxCapacity(int capacity)
    {
        this.mailBoxCapacity=capacity;
    }

    //Set Alternate Email
    public void setAlternateEmail(String altEmail)
    {
        this.alternateEmail=altEmail;
    }

    //Change the password
    public void changePassword(String password)
    {
        this.password=password;
    }

    public int getMailBoxCapacity()
    {
        return mailBoxCapacity;
    }

    public String getAlternateEmail()
    {
        return alternateEmail;
    }

    public String getPassword()
    {
        return password;
    }

    public String showInfo()
    {
        return "For Email Addres :\nfirstName :"+this.firstName+"\nLastName :"+this.lastName+"\nDepartment :"+this.department
                +"\npassword :"+password+"\nMail box Capacity "+mailBoxCapacity;
    }

}
