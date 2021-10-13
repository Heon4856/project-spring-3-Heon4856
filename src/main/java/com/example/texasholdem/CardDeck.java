package com.example.texasholdem;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private static final List<Card> protoDeck = new ArrayList<>();

    static {
        for (Card.Suit suit : Card.Suit.values())
            for (Card.Rank rank : Card.Rank.values())
                protoDeck.add(new Card(rank, suit));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Card card : protoDeck){
            sb.append(card.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
