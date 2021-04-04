package com.assignmentweek3.fileinputoutput;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutput {
    /*
    This is the main method
     */
    public static void main(String[] args) throws IOException {
        File sourcefile = new File("sourcefile.txt");
        File targetfile = new File("targetfile.txt");
        FileWriter sourceInput = new FileWriter("sourcefile.txt");
        sourceInput.write("Data showing in targetfile");
        sourceInput.close();
        try {
            FileReader sourcedata = new FileReader(sourcefile);
            FileWriter targetoutput = new FileWriter(targetfile);
            int character;
            while ((character = sourcedata.read()) != -1) {
                targetoutput.write(character);
            }
            sourcedata.close();
            targetoutput.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}


