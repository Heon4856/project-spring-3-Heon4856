package com.example.texasholdem;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private Long chips;
    private List<Card> playerCard;
    private boolean live;

    public Player(String name, Long chips) {
        this.name = name;
        this.chips = chips;
        this.playerCard = new ArrayList<>();
        this.live = true;
    }

    public void Bet(Long CashToBet) {
        this.chips = this.chips - CashToBet;
    }

    public boolean isLive() {
        return this.live;
    }

    public void Die() {
        this.live = false;
    }

    public void getCard(Card card) {
        playerCard.add(card);
    }

    public List<Card> showCards() {
        return playerCard;
    }

    public Long getChips(){
        return chips;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", chips=" + chips +
                ", cards=" + playerCard +
                '}';
    }

    public String getName(){
        return this.name;
    }


}
