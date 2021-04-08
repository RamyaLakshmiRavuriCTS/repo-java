package com.company;

import java.io.*;
import java.util.Scanner;

public class InputAndOutputStreams {
    //creating constants for files names
    public static String SOURCE_FILE_NAME = "C:\\Users\\842105\\Documents\\sourceFile.txt";
    public static String TARGET_FILE_NAME =  "C:\\Users\\842105\\Documents\\targetFile.txt";

    public static void filesExchange() throws IOException {

        //Creating objects for I/O streaming classes
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream1 = null;

        //try block to handle the exception
        try {
            //Providing path for source file
            fileInputStream = new FileInputStream(SOURCE_FILE_NAME);
            //Providing path for target file
            fileOutputStream = new FileOutputStream(TARGET_FILE_NAME);
            //Copying the text in source file and pasting them in target file
            int i;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write((char) i);
            }

            //this is for printing the text in target file
            fileInputStream1 = new FileInputStream(TARGET_FILE_NAME);
            int j;
            while ((j = fileInputStream1.read()) != -1) {
                System.out.print((char) j);
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
            fileInputStream1.close();
        }

    }

}
