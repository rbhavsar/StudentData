package com.GradleTutorial;


import org.testng.annotations.Test;

import java.time.LocalTime;

public class HelloWorld {


    public static void main(String[] args)
    {
        System.out.println("Hello World!!");
    }

    @Test
    public void testing()
    {
        System.out.println("For testing");
    }
}
