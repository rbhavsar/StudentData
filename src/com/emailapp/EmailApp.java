package com.emailapp;
import org.apache.log4j.Logger;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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


        File file = new File("/Users/rbhavsar/StudentData/Data/src/com/emailapp/application.properties");
        Properties prop = new Properties();
        FileInputStream fileInput = null;

        try {
            log.info("fileInput Stream "+file);
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            log.error("File not found "+e.getMessage());
            e.printStackTrace();
        }

        //load properties file
        try {
            log.info("Load properties file "+fileInput);
            prop.load(fileInput);
        } catch (IOException e) {
            log.error("Error while load Properties "+e.getMessage());
            e.printStackTrace();
        }

        Email email = new Email(prop.getProperty("firstName"),prop.getProperty("lastName"));
        email.setAlternateEmail("rbhavsar@gmail.com");


        //System.out.println("alternateEmail :"+email.getAlternateEmail());

        email.setMailBoxCapacity(100);
        //System.out.println("mailBox Capacity :"+email.getMailBoxCapacity());
        System.out.println(email.showInfo());
    }
}
