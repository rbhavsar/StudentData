package com.emailapp;
import org.apache.log4j.Logger;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class EmailApp {

    private final static Logger log = Logger.getLogger(EmailApp.class.getName());

    public static void main (String[] args)
    {
        PropertyConfigurator.configure("/Users/rbhavsar/StudentData/Data/src/com/emailapp/log4j.properties");

        log.info("****Start EmailApp*****");
        log.debug("Debug Message");
        log.warn("This is Warn");
        log.error("This is an Error ");
        log.fatal("This is Fatal");


        Email email = new Email("Ravi","Bhavsar");

        try {
            email.setAlternateEmail("rbhavsar@gmail.com");
        }
        catch(Exception e)
        {
            log.error("Error while Set Alternate Email "+e.getMessage());
        }
        //System.out.println("alternateEmail :"+email.getAlternateEmail());

        email.setMailBoxCapacity(100);
        //System.out.println("mailBox Capacity :"+email.getMailBoxCapacity());
        System.out.println(email.showInfo());
    }
}
