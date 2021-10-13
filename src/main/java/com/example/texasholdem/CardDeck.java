package com.example.texasholdem;

import java.util.ArrayList;
import java.util.List;

/**
 * 실제 게임에 플레이할 카드 뭉치.
 */
public class CardDeck {
    private static final List<Card> protoDeck = new ArrayList<>();

    static {
        for (Card.Suit suit : Card.Suit.values())
            for (Card.Denomination denomination : Card.Denomination.values())
                protoDeck.add(new Card(denomination, suit));
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
