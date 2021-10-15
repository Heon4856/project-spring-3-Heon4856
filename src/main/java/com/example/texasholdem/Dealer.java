package com.example.texasholdem;

public class Dealer {
    private CardDeck cardDeck;

    public Dealer( CardDeck cardDeck){
        this.cardDeck = cardDeck;

    }


    public void putCard(Player player, CardDeck cardDeck){
        player.getCard(cardDeck.draw());
    }


}
