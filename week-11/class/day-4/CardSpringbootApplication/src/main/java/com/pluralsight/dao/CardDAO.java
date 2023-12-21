package com.pluralsight.dao;

import com.pluralsight.model.Card;

import java.util.List;

public interface CardDAO {

    Card drawCard();

    boolean deleteCard(int id);

    Card updateCard(int id, Card card);

    List<Card> drawAllCards();

}
