package com.pluralsight;
import java.io.*;

public class FileWritingProject {

    public static void main(String args[]) {
        try {
            // create a FileWriter
            FileWriter fileWriter = new FileWriter("text.txt", true);

//           fileWriter.write("Some new information!");
//            // close the file when you are finished using it
//            fileWriter.close();

            // create a BufferedWriter
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            FileReader fileReader = new FileReader("text.txt");

            BufferedReader bufReader = new BufferedReader(fileReader);
            String input = "";
            String[] lastLine;
            int lastNumber = 0;
            int counter = 10;

            while((input = bufReader.readLine()) != null) {
                if (input.length() > 0) {
                    lastLine = input.split("\\ ");
                    lastNumber = Integer.parseInt(lastLine[1]);
                    counter++;
                }
            }
            // write to the file
            String text;
            for(int i = lastNumber + 1; i <= counter; i++) {
                text = String.format("Counting %d\n", i);
                bufWriter.write(text);

            }
            // close the writer
            bufWriter.close();
        }
        catch (IOException e) {
            System.out.println("ERROR:  An unexpected error occurred");
            e.getStackTrace();
        }
    }
}
