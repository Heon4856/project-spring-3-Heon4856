package com.example.texasholdem;

import com.example.texasholdem.Card.Denomination;

import java.util.*;

public class HandValueEvaluator {

    private static Card card;
    List<Card> allCard;
    List<Integer> straightCheck = new ArrayList<>();
    List<Integer> duplicatedChecker = new ArrayList<>();
    List<Integer> highCardChecker = new ArrayList<>();

    Denomination denomination;
    Integer straightCheckNum;
    String flushCheckString;
    String duplicatedCheck;
    Integer highCard;

    public String HandEvaluator(List<Card> allCard) {

        flushCheckString = findFlush(allCard);
        straightCheckNum = findStraight(allCard);
        duplicatedCheck = findDuplicated(allCard);
        highCard = findHighCard(allCard);

        if (duplicatedCheck.equals("Four") || duplicatedCheck.equals("FullHouse")) {
            return duplicatedCheck;
        }

        if (!flushCheckString.equals("nope")) {
            return flushCheckString;
        }

        if (straightCheckNum > 0) {
            return straightCheckNum + "straight";
        }

        if (!duplicatedCheck.equals("nothing")) {
            return duplicatedCheck;
        }

        return Integer.toString(highCard);
    }

    private Integer findHighCard(List<Card> allCard) {
        List<String> denominationList = Card.getDenominationList();

        for (Card card : allCard) {
            Integer cardOrder = denominationList.indexOf(card.getDenomination());
            highCardChecker.add(cardOrder);
        }
        highCardChecker.sort(Comparator.naturalOrder());
        Integer lastIndex = highCardChecker.size() - 1;

        return highCardChecker.get(lastIndex);

    }

    private String findDuplicated(List<Card> allCard) {
        List<String> denominationList = Card.getDenominationList();
        List<Integer> tripleList = new ArrayList<>();
        List<Integer> pairList = new ArrayList<>();

        for (Card card : allCard) {
            Integer cardOrder = denominationList.indexOf(card.getDenomination());
            duplicatedChecker.add(cardOrder);
        }
        Set<Integer> cardSet = new HashSet<>(duplicatedChecker);

        for (Integer cardDenomination : cardSet) {
            if (Collections.frequency(duplicatedChecker, cardDenomination) == 4) {
                return "Four";
            } else if (Collections.frequency(duplicatedChecker, cardDenomination) == 3) {
                tripleList.add(cardDenomination);
            } else if (Collections.frequency(duplicatedChecker, cardDenomination) == 2) {
                pairList.add(cardDenomination);
            }
        }


        if (tripleList.size() == 2 || tripleList.size() == 1 && pairList.size() > 0) {
            return "FullHouse";
        } else if (tripleList.size() == 1) {
            return "triple";
        } else if (pairList.size() >= 2) {
            return "TwoPair";
        } else if (pairList.size() == 1) {
            return "OnePair";
        }

        return "nothing";
    }

    //todo :플러시 중 제일 큰 수 찾기.플러시끼리 똑같을 경우, 비교하기.
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

            return "CLOVER";
        }
        if (spadeCount > 4) {
            spadeCards.sort(Comparator.naturalOrder());

            return "SPADE";
        }
        if (heartCount > 4) {
            heartCards.sort(Comparator.naturalOrder());

            return "HEART";
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
