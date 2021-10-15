package com.example.texasholdem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CardDeckTest {
    private CardDeck cardDeck;
    private CardDeck shuffleCardDeck;
    private Card TopOfCardDeck;
    private int SizeOfCardsBeforeDraw;
    private Card DrawnCard;
    private int SizeOfCardsAfterDraw;

    @BeforeEach
    public void setup() {
        shuffleCardDeck = new CardDeck();
        cardDeck = new CardDeck();
    }

    @Test
    public void Test_DifferenceBetweenTwoDeck() {
        assertNotEquals(cardDeck.getCards(), shuffleCardDeck.getCards());
    }

    @Nested
    @DisplayName("Draw메소드는")
    class Test_DrawFirstCard {

        @BeforeEach
        void setUp() {

            TopOfCardDeck = cardDeck.getCards().get(0);
            SizeOfCardsBeforeDraw = cardDeck.getCards().size();
            DrawnCard = cardDeck.draw();
            SizeOfCardsAfterDraw = cardDeck.getCards().size();
        }


        @Test
        @DisplayName("카드덱의 첫장을 가져온다.")
        void Test_DrawFirstCard() {
            assertEquals(TopOfCardDeck, DrawnCard);
        }

        @Test
        @DisplayName("카드덱의 첫장을 pop한다.")
        void Test_IfDrawThenPopCard() {
            assertEquals(SizeOfCardsBeforeDraw - 1, SizeOfCardsAfterDraw);
        }

    }
}
