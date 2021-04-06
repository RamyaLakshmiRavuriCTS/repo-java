package com.assignment3.Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * creating a class to copy the data from one file to the other fle
 */
public class Files {
    //Creating objects for I/O streaming classes
    public static FileInputStream FILE_INPUT_STREAM =null;
    public static FileOutputStream FILE_OUTPUT_STREAM = null;
    public static FileInputStream FILE_INPUT_STREAM1 = null;

    public static void main(String[] args) throws IOException {

        //try block to handle the exception
        try {
            //Providing path for source file
            FILE_INPUT_STREAM = new FileInputStream("C:\\Workspace\\repo-java\\assignment\\src\\com\\assignment3\\Files\\source_file.txt");
            //Providing path for target file
            FILE_OUTPUT_STREAM = new FileOutputStream("C:\\Workspace\\repo-java\\assignment\\src\\com\\assignment3\\Files\\target_file.txt");
            //Copying the text in source file and pasting them in target file
            int i;
            while ((i = FILE_INPUT_STREAM.read()) != -1) {
                FILE_OUTPUT_STREAM.write((char) i);
            }

            //this is for printing the text in target file
            FILE_INPUT_STREAM1 = new FileInputStream("C:\\Workspace\\repo-java\\assignment\\src\\com\\assignment3\\Files\\target_file.txt");
            int j;
            while ((j = FILE_INPUT_STREAM1.read()) != -1) {
                System.out.print((char) j);
            }
        }
        //If any exception occurs, the exception message will be displayed
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //this block closes the unclosed stream objects
        finally {
            FILE_INPUT_STREAM.close();
            FILE_OUTPUT_STREAM.close();
            FILE_INPUT_STREAM1.close();
        }

    }
}