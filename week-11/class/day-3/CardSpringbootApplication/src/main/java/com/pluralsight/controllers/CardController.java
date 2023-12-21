package com.pluralsight.controllers;

import com.pluralsight.service.CardService;
import com.pluralsight.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @RequestMapping(path="/", method = RequestMethod.GET)
    public String index(@RequestParam(defaultValue="World") String name) {
        return "Hello " + name;
    }

    @RequestMapping(path="/cards", method = RequestMethod.GET)
    public List<Card> cards() {
        return cardService.drawAllCards();
    }

}
