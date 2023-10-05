package com.pluralsight;

public class ConditionalsApp {
    public static void main(String[] args) {
        String name = "Caleb";
        int fav_num = 7;
        int sec_fav_num = 13;


        if (name.equals("Caleb")) {
            System.out.println("C");
        }

        if (fav_num == 22) {
            System.out.println(name + " is playing soccer");
        } else if (fav_num == 7 && sec_fav_num == 13){
            System.out.println("Darrien and Desi are playing soccer");
        } else if (fav_num == 13){
            System.out.println("Desi is playing soccer");
        } else if (fav_num == 13 || fav_num == 22) {
            System.out.println("Desi or Caleb is playing soccer");
        } else {
            System.out.println("no one is playing soccer");
        }


    }


}
