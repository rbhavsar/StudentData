package com.emailapp;

public class EmailApp {

    public static void main (String[] args)
    {
        Email email = new Email("Ravi","Bhavsar");

        email.setAlternateEmail("rbhavsar@gmail.com");
        //System.out.println("alternateEmail :"+email.getAlternateEmail());

        email.setMailBoxCapacity(100);
        //System.out.println("mailBox Capacity :"+email.getMailBoxCapacity());
        System.out.println(email.showInfo());
    }
}
