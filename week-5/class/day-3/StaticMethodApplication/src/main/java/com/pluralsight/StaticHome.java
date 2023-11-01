package com.pluralsight;

public class StaticHome {

    public static void main(String[] args) {

        System.out.println(BankAccount.getInterestRate());

        BankAccount myAccount = new BankAccount("88888", "Chris' Account", 1.0);
        BankAccount andiAccount = new BankAccount("88889", "Andi's Account", 100000000.0);

        System.out.println(andiAccount.getInterestRate());

        BankAccount.setInterestRate(5.0);

        System.out.println(andiAccount.getInterestRate());



    }
}
