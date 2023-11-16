package com.pluralsight;

import java.util.*;

public class PlayingHand<C extends Card> {
    private List<C> cards;

    public PlayingHand() {
        this.cards = new ArrayList<>();
    }

    public PlayingHand(ArrayList<C> initialCards) {
        this.cards = initialCards;
    }

    public void addCard(C card) {
        this.cards.add(card);
    }

    public List<C> getCards() {
        return this.cards;
    }

    public C getCard(int index) {
        if (this.cards.get(index).isFaceUp()) {
            return this.cards.get(index);
        } else {
            return null;
        }
    }
}
