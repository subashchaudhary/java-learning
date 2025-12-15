package filehandling;

import java.io.*;
import java.nio.file.AccessMode;
import java.nio.file.Files;

public class FileHandlingDemo {



    static void main(){
        //file handling
        //this line is use to create a new file; if alreay file is present
        //then point/load that file.

        String fileName = "newfile.txt";
        //create an object of File

        //c://user/subash/mydoc/test.txt  // absoulte path
        //relative path:

        //current directory
        File file = new File(fileName);

     //   RandomAccessFile accessFile = new RandomAccessFile(fileName, "r");
        //how to get the abosolute path
        //String absolutePath = file.getAbsoluteFile().getPath();

        //create new File
        try {


            //create a new file
            file.createNewFile();

        } catch (IOException e) {
            System.out.println("Exceptin while creating a file");
            throw new RuntimeException(e);
        }
        System.out.println("file create success");


        //To write to the file

        String text = "This is Java Tutorials";

        try {
            //fileWrite is used to write the content into the file
            FileWriter fileWriter = new FileWriter(fileName);

            //write the contents to given file
            fileWriter.write(text);
            fileWriter.write(" New Text");

            //remove the resources
            fileWriter.close();
            //fileWriter.flush();

            System.out.println("Successfully Write to File");



        } catch (IOException e) {

            System.out.println("Not a valid file name: ");
            throw new RuntimeException(e);
        }


        //Read file

        try {
            FileReader fileReader = new FileReader(file);

            String inputStreamReader = fileReader.readAllAsString();
            System.out.println(inputStreamReader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //deleting file

        boolean isFileDeleted = file.delete();


    }



}
