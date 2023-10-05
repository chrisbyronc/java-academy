package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1:

        double bobSalary = 1000000.00;
        double garySalary = 500000.00;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: $" + highestSalary);

        // Question 2
        // Find and display the smallest of two variables named carPrice and truckPrice.
        // Set the variables to any value you want.

        double carPrice = 12000.00;
        double truckPrice = 36000.00;

        System.out.println("The lowest car price: " + Math.min(carPrice, truckPrice));



        // Question 3
        //  Find and display the area of a circle whose radius is 7.25


        double radius = 7.25;
        double area = Math.PI * Math.pow(radius , 2);
        System.out.println("The area of a circle with a radius of " + radius + " is " + area);



        //Question 4
        // Find and display the square root a variable after it is set to 5.0

        double number = 5.0;
        double sqrtValue = Math.sqrt(5.0);

        System.out.println("sqrt of " + number + " is " + sqrtValue);



//        Question 5
//        Find and display the distance between the points (5, 10) and (85, 50)

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between some points "+ distance);





//        Question 6
//        Find and display the absolute (positive) value of a variable after it is set to -3.8

//        Question 7
//        Find and display a random number between 0 and 1






    }
}
