package com.pluralsight;

public class Login {

    public static void main(String[] args) {

        /**
         * This is to read from environment variables
         */

//        String myPassword = System.getenv("MY_DB_PASSWORD");
//
//        System.out.println(myPassword);
//


        /**
         * This is to accept arguments
         */

        if (args.length != 2) {
            System.out.println("We have a problem, please provide a username and password");
            System.exit(1);
        }

        String username = args[0];

        String password = args[1];

        System.out.println("Username: " + username + " Password: " + password);
    }

}
