package com.pluralsight.service;

import com.pluralsight.dao.CardDAO;
import com.pluralsight.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CardService {

    private final CardDAO cardDAO;

    @Autowired
    public CardService(CardDAO cardDAOImpl) {
        this.cardDAO = cardDAOImpl;
    }

    public List<Card> drawAllCards() {
        return cardDAO.drawAllCards();
    }

}
