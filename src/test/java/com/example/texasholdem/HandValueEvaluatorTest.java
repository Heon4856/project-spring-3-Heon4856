package com.example.texasholdem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HandValueEvaluatorTest {

    Card card;
    List<Card> allCards = new ArrayList<>();
    List<Integer> straightCheck;
    Card.Denomination denomination;
    Card.Suit suit;

    Integer straightCheckNum;

    @Test
    public void test_StraightCheck(){
        Card card1 = new Card(denomination.TWO, suit.CLOVER);
        Card card2 = new Card(denomination.THREE, suit.HEART);
        Card card3 = new Card(denomination.FOUR, suit.CLOVER);
        Card card4 = new Card(denomination.FIVE, suit.SPADE);
        Card card5 = new Card(denomination.SIX, suit.DIAMOND);
        Card card6 = new Card(denomination.EIGHT, suit.CLOVER);
        Card card7 = new Card(denomination.KING, suit.CLOVER);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("4"+"straight", handValueEvaluator.HandEvaluator(allCards));

    }

    @Test
    public void test_StraightCheck2(){
        Card card1 = new Card(denomination.TWO, suit.CLOVER);
        Card card2 = new Card(denomination.THREE, suit.DIAMOND);
        Card card3 = new Card(denomination.FOUR, suit.DIAMOND);
        Card card4 = new Card(denomination.FIVE, suit.DIAMOND);
        Card card5 = new Card(denomination.SIX, suit.CLOVER);
        Card card6 = new Card(denomination.SEVEN, suit.CLOVER);
        Card card7 = new Card(denomination.KING, suit.CLOVER);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("5"+"straight", handValueEvaluator.HandEvaluator(allCards));

    }
    @Test
    public void test_StraightCheck3(){
        Card card1 = new Card(denomination.TEN, suit.CLOVER);
        Card card2 = new Card(denomination.QUEEN, suit.CLOVER);
        Card card3 = new Card(denomination.JACK, suit.CLOVER);
        Card card4 = new Card(denomination.FIVE, suit.DIAMOND);
        Card card5 = new Card(denomination.ACE, suit.DIAMOND);
        Card card6 = new Card(denomination.SEVEN, suit.DIAMOND);
        Card card7 = new Card(denomination.KING, suit.CLOVER);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("12"+"straight", handValueEvaluator.HandEvaluator(allCards));

    }

    @Test
    public void test_StraightCheck4(){
        Card card1 = new Card(denomination.TWO, suit.DIAMOND);
        Card card2 = new Card(denomination.FOUR, suit.DIAMOND);
        Card card3 = new Card(denomination.THREE, suit.DIAMOND);
        Card card4 = new Card(denomination.FIVE, suit.CLOVER);
        Card card5 = new Card(denomination.ACE, suit.CLOVER);
        Card card6 = new Card(denomination.SEVEN, suit.CLOVER);
        Card card7 = new Card(denomination.KING, suit.CLOVER);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("3"+"straight", handValueEvaluator.HandEvaluator(allCards));

    }

    @Test
    public void test_StraightCheck5(){
        Card card1 = new Card(denomination.TWO, suit.DIAMOND);
        Card card2 = new Card(denomination.FOUR, suit.DIAMOND);
        Card card3 = new Card(denomination.THREE, suit.DIAMOND);
        Card card4 = new Card(denomination.FIVE, suit.CLOVER);
        Card card5 = new Card(denomination.ACE, suit.CLOVER);
        Card card6 = new Card(denomination.SEVEN, suit.CLOVER);
        Card card7 = new Card(denomination.SIX, suit.CLOVER);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("5"+"straight", handValueEvaluator.HandEvaluator(allCards));

    }

    @Test
    public void test_FlushCheck_DIAMOND(){
        Card card1 = new Card(denomination.TWO, suit.DIAMOND);
        Card card2 = new Card(denomination.KING, suit.DIAMOND);
        Card card3 = new Card(denomination.THREE, suit.DIAMOND);
        Card card4 = new Card(denomination.JACK, suit.DIAMOND);
        Card card5 = new Card(denomination.ACE, suit.DIAMOND);
        Card card6 = new Card(denomination.SEVEN, suit.CLOVER);
        Card card7 = new Card(denomination.SIX, suit.CLOVER);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("DIAMOND", handValueEvaluator.HandEvaluator(allCards));

    }
    @Test
    public void test_FlushCheck_CLOVER(){
        Card card1 = new Card(denomination.TWO, suit.DIAMOND);
        Card card2 = new Card(denomination.KING, suit.DIAMOND);
        Card card3 = new Card(denomination.THREE, suit.CLOVER);
        Card card4 = new Card(denomination.JACK, suit.CLOVER);
        Card card5 = new Card(denomination.ACE, suit.CLOVER);
        Card card6 = new Card(denomination.SEVEN, suit.CLOVER);
        Card card7 = new Card(denomination.SIX, suit.CLOVER);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("CLOVER", handValueEvaluator.HandEvaluator(allCards));

    }

    @Test
    public void test_FlushCheck_HEART(){
        Card card1 = new Card(denomination.TWO, suit.DIAMOND);
        Card card2 = new Card(denomination.KING, suit.DIAMOND);
        Card card3 = new Card(denomination.THREE, suit.HEART);
        Card card4 = new Card(denomination.JACK, suit.HEART);
        Card card5 = new Card(denomination.ACE, suit.HEART);
        Card card6 = new Card(denomination.SEVEN, suit.HEART);
        Card card7 = new Card(denomination.SIX, suit.HEART);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("HEART", handValueEvaluator.HandEvaluator(allCards));

    }

    @Test
    public void test_FlushCheck_SPADE(){
        Card card1 = new Card(denomination.TWO, suit.SPADE);
        Card card2 = new Card(denomination.KING, suit.DIAMOND);
        Card card3 = new Card(denomination.THREE, suit.SPADE);
        Card card4 = new Card(denomination.JACK, suit.CLOVER);
        Card card5 = new Card(denomination.ACE, suit.SPADE);
        Card card6 = new Card(denomination.SEVEN, suit.SPADE);
        Card card7 = new Card(denomination.SIX, suit.SPADE);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("SPADE", handValueEvaluator.HandEvaluator(allCards));

    }


    @Test
    public void test_FullHouseCheck(){
        Card card1 = new Card(denomination.TWO, suit.SPADE);
        Card card2 = new Card(denomination.TWO, suit.DIAMOND);
        Card card3 = new Card(denomination.TWO, suit.CLOVER);
        Card card4 = new Card(denomination.JACK, suit.CLOVER);
        Card card5 = new Card(denomination.JACK, suit.SPADE);
        Card card6 = new Card(denomination.JACK, suit.DIAMOND);
        Card card7 = new Card(denomination.SIX, suit.SPADE);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("FullHouse", handValueEvaluator.HandEvaluator(allCards));

    }

    @Test
    public void test_FullHouseCheck2(){
        Card card1 = new Card(denomination.TWO, suit.SPADE);
        Card card2 = new Card(denomination.TWO, suit.DIAMOND);
        Card card3 = new Card(denomination.TWO, suit.CLOVER);
        Card card4 = new Card(denomination.JACK, suit.CLOVER);
        Card card5 = new Card(denomination.JACK, suit.SPADE);
        Card card6 = new Card(denomination.SIX, suit.DIAMOND);
        Card card7 = new Card(denomination.SIX, suit.SPADE);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("FullHouse", handValueEvaluator.HandEvaluator(allCards));

    }

    @Test
    public void test_TripleCheck(){
        Card card1 = new Card(denomination.TWO, suit.SPADE);
        Card card2 = new Card(denomination.TWO, suit.DIAMOND);
        Card card3 = new Card(denomination.TWO, suit.CLOVER);
        Card card4 = new Card(denomination.THREE, suit.CLOVER);
        Card card5 = new Card(denomination.JACK, suit.SPADE);
        Card card6 = new Card(denomination.FOUR, suit.DIAMOND);
        Card card7 = new Card(denomination.SIX, suit.SPADE);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("triple", handValueEvaluator.HandEvaluator(allCards));

    }

    @Test
    public void test_TwoPairsCheck(){
        Card card1 = new Card(denomination.TWO, suit.SPADE);
        Card card2 = new Card(denomination.TWO, suit.DIAMOND);
        Card card3 = new Card(denomination.THREE, suit.CLOVER);
        Card card4 = new Card(denomination.JACK, suit.CLOVER);
        Card card5 = new Card(denomination.JACK, suit.SPADE);
        Card card6 = new Card(denomination.SIX, suit.DIAMOND);
        Card card7 = new Card(denomination.SIX, suit.SPADE);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("TwoPair", handValueEvaluator.HandEvaluator(allCards));

    }

    @Test
    public void test_OnePairCheck(){
        Card card1 = new Card(denomination.TWO, suit.SPADE);
        Card card2 = new Card(denomination.TWO, suit.DIAMOND);
        Card card3 = new Card(denomination.THREE, suit.CLOVER);
        Card card4 = new Card(denomination.KING, suit.CLOVER);
        Card card5 = new Card(denomination.JACK, suit.SPADE);
        Card card6 = new Card(denomination.FIVE, suit.DIAMOND);
        Card card7 = new Card(denomination.SIX, suit.SPADE);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("OnePair", handValueEvaluator.HandEvaluator(allCards));

    }


    @Test
    public void test_FourCardsCheck(){
        Card card1 = new Card(denomination.TWO, suit.SPADE);
        Card card2 = new Card(denomination.TWO, suit.DIAMOND);
        Card card3 = new Card(denomination.TWO, suit.CLOVER);
        Card card4 = new Card(denomination.KING, suit.CLOVER);
        Card card5 = new Card(denomination.TWO, suit.SPADE);
        Card card6 = new Card(denomination.FIVE, suit.DIAMOND);
        Card card7 = new Card(denomination.SIX, suit.SPADE);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("Four", handValueEvaluator.HandEvaluator(allCards));

    }


    @Test
    public void test_HighCardCheck(){
        Card card1 = new Card(denomination.QUEEN, suit.SPADE);
        Card card2 = new Card(denomination.SEVEN, suit.DIAMOND);
        Card card3 = new Card(denomination.TWO, suit.CLOVER);
        Card card4 = new Card(denomination.KING, suit.CLOVER);
        Card card5 = new Card(denomination.EIGHT, suit.SPADE);
        Card card6 = new Card(denomination.FIVE, suit.DIAMOND);
        Card card7 = new Card(denomination.SIX, suit.SPADE);

        allCards.add(card1);
        allCards.add(card2);
        allCards.add(card3);
        allCards.add(card4);
        allCards.add(card5);
        allCards.add(card6);
        allCards.add(card7);

        HandValueEvaluator handValueEvaluator = new HandValueEvaluator();
//        System.out.println("handValueEvaluator.HandEvaluator(allCards) = " + handValueEvaluator.HandEvaluator(allCards));
        assertEquals("11", handValueEvaluator.HandEvaluator(allCards));

    }
}
