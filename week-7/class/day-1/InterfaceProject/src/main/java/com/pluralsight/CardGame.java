package com.pluralsight;

public class CardGame {

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon(25, "cardstock", "yellow", false, false, false, "Pikachu", "electric", "lightning", 40, 2);

        System.out.println(pikachu.getCardNumber());
    }
}
