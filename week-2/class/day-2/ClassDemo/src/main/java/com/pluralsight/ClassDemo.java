package com.pluralsight;

public class ClassDemo {

    public static void main(String[] args) {
        //Person instantiation
        Person chris = new Person(15.5, "Chris", 10000);

        Person aleks = new Person(15.5, "Aleks", 10000);

        System.out.println(aleks.getName());

        aleks.setName("Aleksandr");

        System.out.println(aleks.getName());


       /*
            chris = {
                name: "Chris",
                age: 10000
             }

             chris.name; //Chris


        */



    }

}
