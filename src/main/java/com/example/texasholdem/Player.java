package com.example.texasholdem;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private Long chips;
    private List<Card> playerCard;
    private boolean turn;
    private Long bet;

    public Player(String name, Long chips) {
        this.name = name;
        this.chips = chips;
        this.playerCard = new ArrayList<>();
    }

    public void setBet(Long bet) {
        this.bet = bet;
    }

    public void getCard(Card card) {
        playerCard.add(card);
    }


    public List<Card> showCards() {
        return playerCard;
    }


}
