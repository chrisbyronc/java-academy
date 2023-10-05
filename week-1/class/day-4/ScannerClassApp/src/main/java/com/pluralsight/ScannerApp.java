package com.pluralsight;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        //print does not include CR/LF
//        System.out.print("Hello ");
//        System.out.print("World");


        // printf accepts a value to be formatted and printed to the system out (sout)
//        float subtotal = 22.90f;

//        System.out.printf("The subtotal is %.2f", subtotal);


        // Scanner to accept user inputs

//        Scanner myScanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = myScanner.nextLine();
//
//        System.out.print("Enter your favorite number: ");
//        int fav_num = myScanner.nextInt();


//        System.out.printf("Heya %s and their fav num is %d", name, fav_num);


        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a number 1: ");
        int num1 = myScanner.nextInt();

        System.out.print("Enter a number 2: ");
        int num2 = myScanner.nextInt();

        myScanner.nextLine(); //reads before CRLF
        System.out.println("What do you want to do?");
        System.out.print("  Enter 'add' or 'subtract': ");
        String operation = myScanner.nextLine();

        System.out.println(num1 + " " + operation + " " + num2);






    }
}
