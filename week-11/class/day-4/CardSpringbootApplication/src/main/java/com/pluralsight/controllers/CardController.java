package com.pluralsight.controllers;


import com.pluralsight.dao.CardDAO;
import com.pluralsight.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController {

    private final CardDAO dao;

    @Autowired
    public CardController(CardDAO dao) {
        this.dao = dao;
    }

    @RequestMapping(path="/cards", method = RequestMethod.GET)
    public List<Card> cards() {
        return dao.drawAllCards();
    }

    @RequestMapping(path="/cards", method = RequestMethod.GET)
    public Card drawCards() {
        return dao.drawCard();
    }

    @RequestMapping(path="/cards", method = RequestMethod.POST)
    @ResponseStatus(value= HttpStatus.CREATED)
    public void createCard(@RequestBody Card card) {
        //
    }

    @RequestMapping(path="/cards/{id}", method = RequestMethod.PUT)
    public Card updateCard(@PathVariable int id, @RequestBody Card card) {
        return dao.updateCard(id, card);
    }

    @RequestMapping(path="/cards/{id}", method = RequestMethod.DELETE)
    public void deleteCard(@PathVariable int id) {
        dao.deleteCard(id);
    }


}
