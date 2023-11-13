package com.pluralsight;

public abstract class Card {

    protected int cardNumber, grading;
    protected double price, cardWidth, cardHeight;
    protected String material, color;
    protected boolean holographic, reverseHolographic, artCard;

    public Card(int cardNumber, double cardWidth, double cardHeight, String material, String color, boolean holographic, boolean reverseHolographic, boolean artCard) {
        this.cardNumber = cardNumber;
        this.cardWidth = cardWidth;
        this.cardHeight = cardHeight;
        this.material = material;
        this.color = color;
        this.holographic = holographic;
        this.reverseHolographic = reverseHolographic;
        this.artCard = artCard;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getGrading() {
        return grading;
    }

    public void setGrading(int grading) {
        this.grading = grading;
    }

    public abstract double getPrice();

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHolographic() {
        return holographic;
    }

    public void setHolographic(boolean holographic) {
        this.holographic = holographic;
    }

    public boolean isReverseHolographic() {
        return reverseHolographic;
    }

    public void setReverseHolographic(boolean reverseHolographic) {
        this.reverseHolographic = reverseHolographic;
    }

    public boolean isArtCard() {
        return artCard;
    }

    public void setArtCard(boolean artCard) {
        this.artCard = artCard;
    }
}
