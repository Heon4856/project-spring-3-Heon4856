package com.example.texasholdem;

/**
 * 카드 객체.
 */
public class Card {

    /**
     * 카드의 숫자
     */
    public enum Denomination { TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE };

    /**
     * 카드의 문양
     */
    public enum Suit { CLOVER, DIAMOND, HEART, SPADE }

    private Denomination denomination;
    private Suit suit;

    public Card(Denomination denomination, Suit suit) {
        this.denomination = denomination;
        this.suit = suit;
    }

    public Denomination denomination() { return denomination; }
    public Suit suit() { return suit; }
    public String toString() { return denomination + " of " + suit; }

}
