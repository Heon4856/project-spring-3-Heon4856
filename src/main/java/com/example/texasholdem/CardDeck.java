package com.example.texasholdem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 실제 게임에 플레이할 카드 뭉치.
 */
public class CardDeck {
    private static final List<Card> cardDeck = new ArrayList<>();

    static {
        for (Card.Suit suit : Card.Suit.values())
            for (Card.Denomination denomination : Card.Denomination.values())
                cardDeck.add(new Card(denomination, suit));
    }

    public List<Card> shuffle(){
        Collections.shuffle((cardDeck));
        return cardDeck;
    }

    public Card draw(){
        Card drawnCard = cardDeck.get(0);
        cardDeck.remove(0);
        return drawnCard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Card card : cardDeck){
            sb.append(card.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
