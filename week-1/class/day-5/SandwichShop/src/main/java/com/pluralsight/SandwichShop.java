package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        /*

        Create a Java application named SandwichShop.
        This will be a point of sales application to calculate the cost of a sandwich.

        Step 1
            Prompt the user for the size of the sandwich (1 or 2):
                1: Regular: base price $5.45
                2: Large: base price $8.95
            Prompt the user for their age:
                Student (17 years old or younger) – receive a 10% discount
                Seniors (65 years old or older) – receive a 20% discount
            Display the cost of the sandwich to the screen
         */

        Scanner myScanner = new Scanner(System.in);

        double price = 0;

        System.out.println("Choose a size");
        System.out.println("     1: Regular: base price $5.45");
        System.out.println("     2: Large: base price $8.95");
        System.out.print("Your selection: ");

        int sandwichSize = myScanner.nextInt();


//        switch(sandwichSize) {
//            case 1:
//                price = 5.45;
//                break;
//            case 2:
//                price = 8.95;
//                break;
//            case 3:
//            case 4:
//            case 5:
//                price = 6.45;
//                break;
//            default:
//                System.out.println("That's not sandwich");
//                System.exit(0);
//        }


        if (sandwichSize == 1) {
            price = 5.45;
        } else if (sandwichSize == 2) {
            price = 8.95;
        } else {
            System.out.println("That's not sandwich");
            System.exit(0);
        }

        System.out.print("How old are you?: ");
        int age = myScanner.nextInt();

        /*
            Student (17 years old or younger) – receive a 10% discount
            Seniors (65 years old or older) – receive a 20% discount
         */
        if (age <= 17) {
            price = price - (price * .1);
        } else if (age >= 65) {
            price = price - (price * .2);
        }

        //ternary
//        price = (age == 36) ? 10 : 0;



        System.out.printf("Total $%.2f", price);
    }
}
