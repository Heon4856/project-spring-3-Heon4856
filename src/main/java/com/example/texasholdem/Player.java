package com.example.texasholdem;

import java.util.List;

public class Player {

    private String name;
    private Long chips;
    private List<Card> PlayerCard;
    private boolean turn;
    private Long bet;

    public Player(String name,Long chips){
        this.name=name;
        this.chips = chips;
    }

    public void setBet(Long bet) {
        this.bet = bet;
    }

    public void getCard(Card card){
        PlayerCard.add(card);
    }


    public List<Card> showCards(){
        return PlayerCard;
    }


}
