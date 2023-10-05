package com.pluralsight;

public class MethodApp {

    public static void main(String[] args) {
        String main_sum = add(10, 10);
        System.out.println(main_sum);
    }

    public static String add(int x, int y) {
        int sum = x + y;
        doNothing();
        return "The sum is: " + sum;
    }

    public static void doNothing() {
        int sum = 10 + 30;
    }


}
