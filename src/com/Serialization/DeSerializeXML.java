package com.Serialization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeSerializeXML {

    public static void main(String[] args) {

        try {
            XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollege.xml")));
            College c = (College)x.readObject();
            List<Student> s = c.getStudents();
            for (Student student : s) {
                System.out.println("student "+student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
