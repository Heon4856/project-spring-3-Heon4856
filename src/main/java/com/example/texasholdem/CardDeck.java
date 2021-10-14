package com.example.texasholdem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 실제 게임에 플레이할 카드 뭉치.
 */
public class CardDeck {
    private List<Card> cards;

    public CardDeck() {
        this.cards = this.generateCards();
        Collections.shuffle(this.cards);
    }


    private List<Card> generateCards() {
        List<Card> cardDeck = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Denomination denomination : Card.Denomination.values()) {
                cardDeck.add(new Card(denomination, suit));
            }
        }
        return cardDeck;
    }

    public List<Card> getCards() {
        return cards;
    }


    public Card draw(){
        Card drawnCard = this.cards.get(0);
        this.cards.remove(0);
        return drawnCard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Card card : this.cards){
            sb.append(card.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
