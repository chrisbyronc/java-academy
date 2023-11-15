package com.pluralsight;

public class PlayingCard extends Card implements PlayableInterface {

    String suit, brand;

    public PlayingCard(int cardNumber, double cardWidth, double cardHeight, String material, String color, boolean holographic, boolean reverseHolographic, boolean artCard, String suit, String brand) {
        super(cardNumber, cardWidth, cardHeight, material, color, holographic, reverseHolographic, artCard);

        this.suit = suit;
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void play() {

    }
}
