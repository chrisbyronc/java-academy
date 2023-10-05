package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1:

        double bobSalary = 1000000.00;
        double garySalary = 500000.00;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: $" + highestSalary);
    }
}
