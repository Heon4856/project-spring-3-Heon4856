package com.example.texasholdem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DealerTest {

    private final String testName = "test_name";
    private final Long testChips = 1000L;
    private Dealer dealer;
    private Player player;
    private CardDeck cardDeck;
    private Table table;
    private int BURNED_CARD_SIZE = 51;

    @BeforeEach
    public void setUp() {
        cardDeck = new CardDeck();
        player = new Player(testName, testChips);
        table = new Table();
        dealer = new Dealer(cardDeck);

    }


    @Test
    public void test_drawCard() {

        Card playerCard = cardDeck.getCards().get(0);
        Card tableCard = cardDeck.getCards().get(1);

        dealer.putCardToPlayer(player, cardDeck);
        dealer.putCardToTable(table, cardDeck);

        assertEquals(playerCard, player.showCards().get(0));
        assertEquals(tableCard, table.showCards().get(0));
    }

    @Test
    public void test_burnCard() {
        List<Card> expectedBurnCardDeck = new ArrayList<>();

        for(int i=1 ;i<= 51;i++ ){
            expectedBurnCardDeck.add(cardDeck.getCards().get(i));
        }

        dealer.burnCard(cardDeck);
        assertEquals(BURNED_CARD_SIZE, cardDeck.getCards().size());
        assertEquals(expectedBurnCardDeck, cardDeck.getCards());
    }
}
