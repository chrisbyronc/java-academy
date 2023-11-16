package com.pluralsight;

import java.util.*;

public class CardGame {

    public static void main(String[] args) {
//        Pokemon pikachu = new Pokemon(25, "cardstock", "yellow", false, false, false, "Pikachu", "electric", "lightning", 40, 2);
//        Pokemon eevee = new Pokemon(133, "cardstock", "brown", false, true, false, "Eevee", "electric", "normal", 33, 20);
//        Pokemon rayquaza = new Pokemon(384, "cardstock", "gold", false, true, false, "Rayquaza", "dragon", "flying", 100, 25);
//        Pokemon mew = new Pokemon(151, "cardstock", "purple", false, true, false, "Mew", "pyschic", "pyschic", 75, 40);
//
//        ArrayList<Card> pokemonCards = new ArrayList<>();
//        pokemonCards.add(pikachu);
//        pokemonCards.add(eevee);
//        pokemonCards.add(rayquaza);
//        pokemonCards.add(mew);
//
//        PlayingHand<Card> pokemonHand = new PlayingHand<>(pokemonCards);


        List<PlayingCard> deck = createFullDeck();

        PlayingHand<PlayingCard> playerOneHand = new PlayingHand<>();
        PlayingHand<PlayingCard> playerTwoHand = new PlayingHand<>();

//        System.out.println(deck.stream().filter(card -> card.getSuit().equals("spades")).count());

        divideDeckIntoHands(deck, playerOneHand, playerTwoHand);

        playerOneHand.getCards().stream()
                .filter(card -> card.getSuit().equals("spades"))
                .forEach(card -> System.out.println(card.getCard() + " of spades"));

        int reducedV = playerOneHand.getCards().stream()
                .filter(card -> card.getSuit().equals("spades"))
                .mapToInt(PlayingCard::getCardNumber)
                .reduce(0, Integer::sum);

        System.out.println(reducedV);

    }

    private static void divideDeckIntoHands(List<PlayingCard> deck, PlayingHand<PlayingCard> handOne, PlayingHand<PlayingCard> handTwo) {

        Collections.shuffle(deck);

        boolean[] handOffToFirstHand = {true};

        deck.forEach(card -> {

            if (handOffToFirstHand[0]) {
                handOne.addCard(card);
            } else {
                handTwo.addCard(card);
            }

            handOffToFirstHand[0] = !handOffToFirstHand[0];
        });

    }


    private static List<PlayingCard> createFullDeck() {
        List<PlayingCard> deck = new ArrayList<>();
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};

        for (String suit : suits) {
            for (int rank = 1; rank <= 13; rank++) {
                deck.add(new PlayingCard(rank, suit));
            }
        }

        return deck;
    }

}
