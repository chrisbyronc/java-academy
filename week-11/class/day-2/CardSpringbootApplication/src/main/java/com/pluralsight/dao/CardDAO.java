package com.pluralsight.dao;

import com.pluralsight.model.Card;

import java.util.List;

public interface CardDAO {

    Card drawCard();

    List<Card> drawAllCards();

}
