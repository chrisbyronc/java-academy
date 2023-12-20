package com.pluralsight.commandline;

import com.pluralsight.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CardApplication implements CommandLineRunner {

    private final CardService cardService;

    public CardApplication(CardService cardService) {
        this.cardService = cardService;
    }

    @Override
    public void run(String... args) throws Exception {
        cardService.drawAllCards().forEach(card -> System.out.println("Card Suit: " + card.getSuit() + " Card Value: " + card.getValue() + " Card Name: " + card.getName()));
    }
}
