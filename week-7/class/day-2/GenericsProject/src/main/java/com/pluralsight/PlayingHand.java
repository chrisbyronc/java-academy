package com.pluralsight;

import java.util.*;

public class PlayingHand<C extends Card> {
    private List<C> cards;

    public PlayingHand(ArrayList<C> initialCards) {
        this.cards = initialCards;
    }

    public List<C> getCards() {
        return cards;
    }

    public C getCard(int index) {
        return this.cards.get(index);
    }
}
