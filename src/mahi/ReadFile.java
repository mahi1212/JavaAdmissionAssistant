package mahi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile extends ShowInfo{
    void readMyFile(String folderName, String fileName){
        try{
            BufferedReader dept = new BufferedReader(new FileReader
                    ("C:\\Users\\Mahi\\OneDrive\\Desktop\\Test\\" + folderName + "\\" + fileName + ".txt"));
            String text;
            while ((text = dept.readLine()) != null){
                System.out.println(text);
            }
            dept.close();
        }catch (Exception e){
            return;
        }
    }
}

