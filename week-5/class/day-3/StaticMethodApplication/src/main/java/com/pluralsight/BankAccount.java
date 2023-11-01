package com.pluralsight;

public class BankAccount {

    private static double interestRate = 6.7;
    private String number;
    private String name;
    private double balance;
    public BankAccount(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double newRate) {
        BankAccount.interestRate = newRate;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
}
