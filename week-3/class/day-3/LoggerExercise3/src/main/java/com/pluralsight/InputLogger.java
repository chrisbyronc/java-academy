package com.pluralsight;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputLogger {

    /*
        Create a Java application named SearchEngineLogger.

        Create a method to log the actions of the user. Write each user action to a file name logs.txt.

        Actions include:
        Launching the application
        Searching for a term
        Exiting the application

        In the main() method prompt the user for a search term that they wish to search.

        Example
        Enter a search term (X to exit):

        Example
        Entries in the logs.txt file should follow this format:

        2023-09-06 12:42:20 launch
        2023-09-06 12:42:45 search : How to use ChatGPT
        2023-09-06 12:43:51 search : How to forge a camp knife
        2023-09-06 12:45:32 exit
     */

    public static void main(String[] args) {
        logAction("launch");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a search term (X to exit): ");
            String input = scanner.nextLine().trim();

            if("X".equalsIgnoreCase(input)) {
                logAction("exit");
                break;
            } else {
                logAction("search : " + input);
            }
        }
        scanner.close();
        System.exit(0);
    }

    public static void logAction(String action) {
        try {
            BufferedWriter logger = new BufferedWriter(new FileWriter("log.txt", true));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = formatter.format(LocalDateTime.now());
//            String timestamp2 = LocalDateTime.now().format(formatter);

            logger.write(timestamp + " " + action);
            logger.newLine();
            logger.close();


        } catch(IOException error) {
            error.printStackTrace();
        }
    }
}
