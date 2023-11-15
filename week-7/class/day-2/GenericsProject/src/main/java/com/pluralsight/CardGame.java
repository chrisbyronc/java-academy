package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CardGame {

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon(25, "cardstock", "yellow", false, false, false, "Pikachu", "electric", "lightning", 40, 2);
        Pokemon eevee = new Pokemon(133, "cardstock", "brown", false, true, false, "Eevee", "electric", "normal", 33, 20);
        Pokemon rayquaza = new Pokemon(384, "cardstock", "gold", false, true, false, "Rayquaza", "dragon", "flying", 100, 25);
        Pokemon mew = new Pokemon(151, "cardstock", "purple", false, true, false, "Mew", "pyschic", "pyschic", 75, 40);

        ArrayList<Card> pokemonCards = new ArrayList<>();
        pokemonCards.add(pikachu);
        pokemonCards.add(eevee);
        pokemonCards.add(rayquaza);
        pokemonCards.add(mew);

        PlayingHand<Card> playerOnesHand = new PlayingHand<>(pokemonCards);


        PlayingCard aceOfSpades = new PlayingCard(1, 4.5, 4.6, "cardstock", "white", false, false, false, "spades", "bicycle");
        PlayingCard sevenOfHearts = new PlayingCard(7, 4.5, 4.6, "cardstock", "white", false, false, false, "hearts", "bicycle");

        ArrayList<Card> warCards = new ArrayList<>();
        warCards.add(aceOfSpades);
        warCards.add(sevenOfHearts);


        PlayingHand<Card> warPlayersHandOne = new PlayingHand<>(warCards);
    }
}
