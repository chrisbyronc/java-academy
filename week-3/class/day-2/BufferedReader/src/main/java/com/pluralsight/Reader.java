package com.pluralsight;
import java.io.*;

public class Reader {
    public static void main(String args[]) {
        try {
            // create a FileReader object connected to the File
            FileReader fileReader = new FileReader("src/main/resources/poem.txt");
            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            boolean runValue = true;

            while(runValue) {
                if (bufReader.ready()) {
                    // read until there is no more data
                    while ((input = bufReader.readLine()) != null) {

                        System.out.println(input);
                    }
                    runValue = false;
                } else {
                    //sleep for 5s
                }
            }

            // close the stream and release the resources
            bufReader.close();
        } catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}