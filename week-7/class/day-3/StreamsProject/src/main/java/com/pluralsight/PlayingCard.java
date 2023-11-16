package com.pluralsight;

public class PlayingCard extends Card implements PlayableInterface {

    String suit, brand;

    public PlayingCard(int cardNumber, String suit) {
        super(cardNumber, 4.5, 4.6, "cardstock", "white", false, false, false);

        this.suit = suit;
        this.brand = "bicycle";
    }

    public String getSuit() {
        return this.suit;
    }

    public String getCard() {
        switch(this.getCardNumber()) {
            case 1: return "Ace";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "Unknown"; // default case to handle unexpected values
        }
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void play() {

    }
}
