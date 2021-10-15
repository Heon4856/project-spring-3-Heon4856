package com.example.texasholdem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DealerTest {

    private Dealer dealer;
    private Player player;
    private CardDeck cardDeck;

    private final String testName = "test_name";
    private final Long testChips = 1000L;


    @Test
    public void test_drawCard(){
        cardDeck = new CardDeck();
        player = new Player(testName, testChips);
        dealer =new Dealer(cardDeck);
        dealer.putCard(player,cardDeck);

        System.out.println(player.showCards());
    }
}
