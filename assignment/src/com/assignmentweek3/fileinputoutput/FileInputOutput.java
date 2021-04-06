package com.assignmentweek3.fileinputoutput;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
This is the FileInputOutput class
 */
public class FileInputOutput {
    private static String SOURCE_FILE = "sourcefile.txt";
    private static String TARGET_FILE ="targetfile.txt";
    private static File targetfile;
    private static File sourcefile;

    public FileInputOutput(File sourcefile, File targetfile) {
        this.sourcefile = sourcefile;
        this.targetfile = targetfile;
    }

   static File sourcefileOutput =new File(SOURCE_FILE);
   static File targetfileOutput =new File(TARGET_FILE);

    /*
    This is the main method
     */
    public static void main(String[] args) throws IOException,NullPointerException {

        new FileInputOutput( sourcefileOutput, targetfileOutput);
        insertingSourceInput();
        copyOfData();
    }
/*
This method is used for inserting input data
 */
    private static void insertingSourceInput() throws IOException {
        FileWriter sourceInput = new FileWriter("sourcefile.txt");
        sourceInput.write("Data showing in targetfile");
        sourceInput.close();
    }
/*
This method is used to copy data from source file into target file
 */
    private static void copyOfData() throws IOException {
        FileReader sourcedata = new FileReader(sourcefile);
        FileWriter targetoutput = new FileWriter(targetfile);
        try {
            int character;
            while ((character = sourcedata.read()) != -1) {
                targetoutput.write(character);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        finally{
            sourcedata.close();
            targetoutput.close();
        }
    }
}


