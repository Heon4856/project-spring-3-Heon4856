package com.example.texasholdem;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Card> tableCard;

    public Table() {
        this.tableCard = new ArrayList<>();
    }

    public void getCard(Card card) {
        tableCard.add(card);
    }
}
