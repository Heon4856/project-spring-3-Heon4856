package com.example.texasholdem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.example.texasholdem.Card.Denomination;

public class HandValueEvaluator {

    private static Card card;
    List<Card> allCard;
    List<Integer> straightCheck = new ArrayList<>();
    Denomination denomination;
    Integer straightCheckNum;

    public String HandEvaluator(List<Card> allCard ){

        straightCheckNum =findStraight(allCard);

        if (straightCheckNum>0 ){

            return straightCheckNum+"straight";
        }else{
            return "not Straight";
        }

    }

    private int findStraight(List<Card> allCard) {
        List<String> denominationList = Card.getDenominationList();

        for(Card card : allCard){
            System.out.println("card.getDenomination() = " + card.getDenomination());
            Integer cardOrder=denominationList.indexOf(card.getDenomination());
            straightCheck.add(cardOrder);
        }

        straightCheck.sort(Comparator.naturalOrder());
        int countValue = 0;
        int straightCheckNum = 0;
        for( int i=0 ; i<straightCheck.size()-1; i++){


            if( straightCheck.get(i+1)-straightCheck.get(i) ==1 ){
                countValue += 1;
                if(countValue >5){
                    straightCheckNum = straightCheck.get(i+1);
                }
            } else{
                countValue = 0 ;
            }

        }
        return straightCheckNum;

    }
}
