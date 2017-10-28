package com.Serialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML {

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setRollno(101);
        std1.setSname("Ravi");


        Student std2 = new Student();
        std2.setRollno(102);
        std2.setSname("Ronak");

        List<Student> s = new ArrayList<Student>();
        s.add(std1);
        s.add(std2);

        College c = new College();
        c.setStudents(s);

        try {
            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
            x.writeObject(c);
            x.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
