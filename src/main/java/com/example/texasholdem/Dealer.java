package com.example.texasholdem;

public class Dealer {
    private CardDeck cardDeck;

    public Dealer(CardDeck cardDeck) {
        this.cardDeck = cardDeck;
    }

    public void putCardToPlayer(Player player, CardDeck cardDeck) {
        player.getCard(cardDeck.draw());
    }

    public void putCardToTable(Table table, CardDeck cardDeck) {
        table.getCard(cardDeck.draw());
    }

    public void burnCard(CardDeck cardDeck) {
        cardDeck.draw();
    }
}
