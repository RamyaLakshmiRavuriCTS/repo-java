package com.company;

import java.io.*;
import java.util.Scanner;

public class InputAndOutputStreams {
    public void filesExchange() throws IOException {
        //instantiating file class
        File file=new File("C:\\Users\\842105\\Documents\\sourceFile.txt");
        //instantiating FileInputStream class
        FileInputStream inputStream=new FileInputStream(file);
        //scanner class
        Scanner scanner=new Scanner(inputStream);
        //StringBuffer to store contents
        StringBuffer buffer=new StringBuffer();
        //appending each line to the buffer
        while (scanner.hasNext()){
            buffer.append(" "+scanner.nextLine());
        }
        System.out.println("Contents of the file: "+buffer);
        //file object to hold the destination file
        File dest=new File("C:\\Users\\842105\\Documents\\targetFile.txt");
        //instantiating FileWriter object
        FileWriter writer=new FileWriter(dest);
        //writing contents to destination file
        writer.write(buffer.toString());
        writer.flush();
        System.out.println("File copied successfully!!");

    }
}
