package com.pluralsight;

public class MagicTheGathering extends Card implements PlayableInterface{

    String colors, type, manaCosts;
    int power, toughness;

    public MagicTheGathering(int cardNumber, double cardWidth, double cardHeight, String material, String color, boolean holographic, boolean reverseHolographic, boolean artCard, String colors, String type, String manaCosts, int power, int toughness) {
        super(cardNumber, cardWidth, cardHeight, material, color, holographic, reverseHolographic, artCard);

        this.colors = colors;
        this.type = type;
        this.manaCosts = manaCosts;
        this.power = power;
        this.toughness = toughness;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void play() {

    }
}
