package com.assignment.exception3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exception3 {

    public static void main(String[] args) throws IOException {

        //Creating objects for I/O streaming classes
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int i;

        try {
            //Providing path for source file
            fileInputStream = new FileInputStream("C:\\Project\\repo-java\\assignment\\src\\com\\assignment\\exception3\\source_file.txt");
            //Providing path for target file
            fileOutputStream = new FileOutputStream("C:\\Project\\repo-java\\assignment\\src\\com\\assignment\\exception3\\target_file.txt");
            //Copying the text in source file and pasting them in target file
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write((char) i);
            }
        }

        //If any exception occurs, the exception message will be displayed
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //this block closes the unclosed stream objects
        finally {
            fileInputStream.close();
            fileOutputStream.close();
        }

        //this is for printing the text in target file
        FileInputStream fileInputStream1 = new FileInputStream("C:\\Project\\repo-java\\assignment\\src\\com\\assignment\\exception3\\target_file.txt");
        int j;

        while((j=fileInputStream1.read()) != -1) {
            System.out.print((char)j);
        }
        fileInputStream1.close();
    }
}
