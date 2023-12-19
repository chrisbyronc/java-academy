package com.pluralsight;

import com.pluralsight.service.CardService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CardSpringbootApp {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CardSpringbootApp.class, args);
		CardService cardService = context.getBean(CardService.class);

		cardService.drawAllCards().forEach(card -> System.out.println("Card Name: " + card.getName() + " Card Suit: " + card.getSuit()));
	}

}
