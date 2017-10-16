package com.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    //Read data from csv and retun list
    public static List<String[]> read(String file) throws IOException {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while((dataRow = br.readLine()) != null) {
                //dataRow = br.readLine();
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }

        } catch (FileNotFoundException e) {
            System.out.println("FILE COULD NOT FOUND !!");
            e.printStackTrace();
        }


        return data;
    }

}
