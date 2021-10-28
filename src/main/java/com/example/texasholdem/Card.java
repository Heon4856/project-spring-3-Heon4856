package com.example.texasholdem;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


    public static List<String> getDenominationList() {
        List<String> denominationList = Stream.of(Denomination.values())
                .map(Enum::name)
                .collect(Collectors.toList());

        return denominationList; }

    public String getDenomination() { return denomination.toString(); }
    public Suit getSuit() { return this.suit; }
    public String toString() { return denomination + " of " + suit; }

}
