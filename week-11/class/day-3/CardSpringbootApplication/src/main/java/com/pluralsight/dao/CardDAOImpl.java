package com.pluralsight.dao;

import com.pluralsight.model.Card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardDAOImpl implements CardDAO {

    private final Map<Integer, Card> cards = new HashMap<>();

    public CardDAOImpl(String username) {
        System.out.println("User signed in: " + username);

        cards.put(1, new Card("Clubs", "King", 10));
        cards.put(2, new Card("Spades", "Ace", 11));
        cards.put(3, new Card("Hearts", "Three", 3));
        cards.put(4, new Card("Hearts", "Four", 4));
    }

    @Override
    public Card drawCard() {
        return null;
    }

    @Override
    public List<Card> drawAllCards() {
        return new ArrayList<>(cards.values());
    }
}
