package com.assignment3.Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* creating a class to copy the data from one file to the other fle
 */
public class Files {
    public static void main(String[] args) throws IOException {

        //Creating objects for I/O streaming classes
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int i;

        //try block to handle the exception
        try {
            //Providing path for source file
            fileInputStream = new FileInputStream("C:\\Workspace\\repo-java\\assignment\\src\\com\\assignment3\\Files\\source_file.txt");
            //Providing path for target file
            fileOutputStream = new FileOutputStream("C:\\Workspace\\repo-java\\assignment\\src\\com\\assignment3\\Files\\target_file.txt");
            //Copying the text in source file and pasting them in target file
            while((i=fileInputStream.read()) != -1) {
                fileOutputStream.write((char)i);
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
        FileInputStream fileInputStream1 = new FileInputStream("C:\\Workspace\\repo-java\\assignment\\src\\com\\assignment3\\Files\\target_file.txt");
        int j;
        while((j=fileInputStream1.read()) != -1) {
            System.out.print((char)j);
        }
        fileInputStream1.close();
    }
}
