package com.example.texasholdem;

import com.example.texasholdem.Card.Denomination;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HandValueEvaluator {

    private static Card card;
    List<Card> allCard;
    List<Integer> straightCheck = new ArrayList<>();
    Denomination denomination;
    Integer straightCheckNum;
    String flushCheckString;

    public String HandEvaluator(List<Card> allCard) {

        flushCheckString=findFlush(allCard);
        straightCheckNum = findStraight(allCard);

        if (flushCheckString != "nope"){
            return flushCheckString;
        }

        if (straightCheckNum > 0) {
            return straightCheckNum + "straight";
        } else {
            return "not Straight";
        }

    }

    //todo :플러시 중 제일 큰 수 찾기.
    private String findFlush(List<Card> allCard) {
        List<String> denominationList = Card.getDenominationList();
        List<Integer> cloverCards = new ArrayList<>();
        List<Integer> spadeCards = new ArrayList<>();
        List<Integer> diamondCards = new ArrayList<>();
        List<Integer> heartCards = new ArrayList<>();

        int cloverCount = 0;
        int spadeCount = 0;
        int diamondCount = 0;
        int heartCount = 0;

        for (Card card : allCard) {
            Integer cardOrder = denominationList.indexOf(card.getDenomination());

            if (card.getSuit() == Card.Suit.DIAMOND) {
                diamondCount += 1;
                diamondCards.add(cardOrder);
            } else if (card.getSuit() == Card.Suit.CLOVER) {
                cloverCount += 1;
                cloverCards.add(cardOrder);
            } else if (card.getSuit() == Card.Suit.SPADE) {
                spadeCount += 1;
                spadeCards.add(cardOrder);
            } else {
                heartCount += 1;
                heartCards.add(cardOrder);
            }
        }

        if (diamondCount > 4) {
            diamondCards.sort(Comparator.naturalOrder());

            return "DIAMOND";
        }
        if (cloverCount > 4) {
            cloverCards.sort(Comparator.naturalOrder());

            return "clover";
        } if (spadeCount > 4) {
            spadeCards.sort(Comparator.naturalOrder());

            return "spade";
        } if (heartCount > 4) {
            heartCards.sort(Comparator.naturalOrder());

            return "heart";
        }

        return "nope";
    }


    private int findStraight(List<Card> allCard) {
        List<String> denominationList = Card.getDenominationList();
        int countValue = 0;
        int straightCheckNum = 0;

        for (Card card : allCard) {
            Integer cardOrder = denominationList.indexOf(card.getDenomination());
            straightCheck.add(cardOrder);
        }
        straightCheck.sort(Comparator.naturalOrder());

        for (int i = 0; i < straightCheck.size() - 1; i++) {
            if (straightCheck.get(i + 1) - straightCheck.get(i) == 1) {
                countValue += 1;
                if (countValue > 3) {
                    straightCheckNum = straightCheck.get(i + 1);
                } else if (countValue == 3 && straightCheck.get(6) == 12) {
                    straightCheckNum = straightCheck.get(i + 1);
                }
            } else {
                countValue = 0;
            }
        }
        return straightCheckNum;

    }
}
