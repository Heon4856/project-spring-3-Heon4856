package com.example.texasholdem;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Card> tableCard;
    private Long pot;

    public Table() {
        this.tableCard = new ArrayList<>();
        this.pot = 0L;
    }

    public void getCard(Card card) {
        tableCard.add(card);
    }

    public List<Card> showCards() {
        return tableCard;
    }

    public void moneyToPot(Long betMoney){
        this.pot = this.pot + betMoney;
    }

    public Long getPot() {
        return pot;
    }

}
